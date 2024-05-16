package com.phat.ctrs.utils;

import com.google.ortools.Loader;
import com.google.ortools.sat.CpModel;
import com.google.ortools.sat.CpSolver;
import com.google.ortools.sat.CpSolverStatus;
import com.google.ortools.sat.IntVar;
import com.google.ortools.sat.IntervalVar;
import com.google.ortools.sat.LinearExpr;
import com.google.ortools.sat.LinearExprBuilder;
import com.google.ortools.sat.Literal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.IntStream;

public class OrToolForBookingEmployee {
    public static HashMap<Integer, List<Integer>> or(int[][] costs, int[] max_debt, int[][] times,
            int[][][] workerShift, int[] skillRequire, int[][] workerSkill) {
        Loader.loadNativeLibraries();
        // int[] numWorkersRequired = { 1, 2, 1 };

        final int numWorkers = costs.length;
        final int numTasks = costs[0].length;

        final int[] allWorkers = IntStream.range(0, numWorkers).toArray();
        final int[] allTasks = IntStream.range(0, numTasks).toArray();

        LinearExprBuilder obj = LinearExpr.newBuilder();
        // Model
        CpModel model = new CpModel();

        // Variables
        Literal[][] x = new Literal[numWorkers][numTasks];
        for (int worker : allWorkers) {
            for (int task : allTasks) {
                x[worker][task] = model.newBoolVar("x[" + worker + "," + task + "]");
            }
        }

        for (int worker : allWorkers) {
            List<IntervalVar> lst = new ArrayList<>();
            // shift constraint
            if (workerShift[worker] != null) {
                for (int[] shift : workerShift[worker]) {
                    int shift_st = shift[0];
                    int shift_en = shift[1];
                    IntVar _shift_st = model.newConstant(shift_st);
                    IntVar _shift_en = model.newConstant(shift_en);
                    IntVar _shift_size = model.newConstant(shift_en - shift_st);
                    lst.add(model.newIntervalVar(_shift_st, _shift_size, _shift_en,
                            "worker-task-shift" + worker));
                }
            }
            // time constraint
            for (int task : allTasks) {
                int st = times[task][0];
                int en = times[task][1];
                IntVar _st = model.newConstant(st);
                IntVar _en = model.newConstant(en);
                IntVar _size = model.newConstant(en - st);
                lst.add(model.newOptionalIntervalVar(_st, _size, _en, x[worker][task],
                        "worker-task" + task + worker));
            }
            model.addNoOverlap(lst);
        }
        // DEBT
        for (int worker : allWorkers) {
            LinearExprBuilder debt_lst = LinearExpr.newBuilder();
            for (int task : allTasks) {
                debt_lst.addTerm(x[worker][task], costs[worker][task]);
            }
            model.addLessOrEqual(debt_lst, max_debt[worker]);
        }
        // Skill constraint
        for (int task : allTasks) {
            List<Literal> eligibleWorkers = new ArrayList<>();
            for (int worker : allWorkers) {
                boolean hasRequiredSkill = false;
                for (int skill : workerSkill[worker]) {
                    if (skillRequire[task] == skill) {
                        hasRequiredSkill = true;
                        break;
                    }
                }
                if (hasRequiredSkill) {
                    eligibleWorkers.add(x[worker][task]);
                } else {
                    model.addEquality(x[worker][task], 0);
                }
            }
            model.addExactlyOne(eligibleWorkers);
        }

        // Ensure the number of people doing each job
        // for (int task : allTasks) {
        // List<Literal> assignedWorkers = new ArrayList<>();
        // for (int worker : allWorkers) {
        // assignedWorkers.add(x[worker][task]);
        // }
        // Literal[] assignedWorkersArray = assignedWorkers.toArray(new Literal[0]);
        // LinearExpr sumExpr = LinearExpr.sum(assignedWorkersArray);
        // model.addGreaterOrEqual(sumExpr, numWorkersRequired[task]);
        // }
        for (int task : allTasks) {
            List<Literal> workers = new ArrayList<>();
            for (int worker : allWorkers) {
                workers.add(x[worker][task]);
            }
            model.addExactlyOne(workers);
        }
        // Objective
        for (int worker : allWorkers) {
            for (int task : allTasks) {
                obj.addTerm(x[worker][task], costs[worker][task]);
            }
        }
        model.minimize(obj);

        // Solve
        CpSolver solver = new CpSolver();
        CpSolverStatus status = solver.solve(model);

        // Print solution.
        HashMap<Integer, List<Integer>> solution = new HashMap<Integer, List<Integer>>();
        if (status == CpSolverStatus.OPTIMAL || status == CpSolverStatus.FEASIBLE) {
            System.out.println("Total cost: " + solver.objectiveValue() + "\n");
            for (int worker : allWorkers) {
                List<Integer> l = new ArrayList<>();
                for (int task : allTasks) {
                    if (solver.booleanValue(x[worker][task])) {
                        System.out.println("Worker " + worker + " assigned to task " + task
                                + ".  Cost: " + costs[worker][task]);
                        // + "; start: " + times[task][0] + "; end: " + times[task][1]);
                        l.add(task);
                    }
                }
                if (l.size() > 0) {
                    solution.put(worker, l);
                }
            }
        } else {
            System.err.println("No solution found.");
        }
        return solution;
    }
}
