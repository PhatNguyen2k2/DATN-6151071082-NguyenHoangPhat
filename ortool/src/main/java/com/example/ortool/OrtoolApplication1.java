package com.example.ortool;

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
import java.util.List;
import java.util.stream.IntStream;

/** Assignment problem. */
public class OrtoolApplication1 {
    public static void main(String[] args) {
        Loader.loadNativeLibraries();
        // Data
        int[][] costs = {
                { 90, 76, 75, 20 },
                { 35, 85, 55, 20 },
                { 35, 85, 55, 20 },
        };

        int[][] times = { { 0, 10 }, { 11, 20 }, { 19, 30 }, { 19, 30 } };

        final int numWorkers = costs.length;
        final int numTasks = costs[0].length;

        final int[] allWorkers = IntStream.range(0, numWorkers).toArray();
        final int[] allTasks = IntStream.range(0, numTasks).toArray();

        // Model
        CpModel model = new CpModel();

        // Variables
        Literal[][] x = new Literal[numWorkers][numTasks];
        for (int worker : allWorkers) {
            for (int task : allTasks) {
                x[worker][task] = model.newBoolVar("x[" + worker + "," + task + "]");
            }
        }

        // Each task is assigned to exactly one worker.
        for (int worker : allWorkers) {
            List<IntervalVar> lst = new ArrayList<>();
            for (int task : allTasks) {
                int st = times[task][0];
                int en = times[task][1];
                IntVar _st = model.newConstant(st);
                IntVar _en = model.newConstant(en);
                IntVar _sten = model.newConstant(en - st);
                lst.add(model.newOptionalIntervalVar(_st, _sten, _en, x[worker][task], "worker-task" + task + worker));
            }
            model.addNoOverlap(lst);
        }

        // Each task is assigned to exactly one worker.
        for (int task : allTasks) {
            List<Literal> workers = new ArrayList<>();
            for (int worker : allWorkers) {
                workers.add(x[worker][task]);
            }
            model.addExactlyOne(workers);
        }

        // Objective
        LinearExprBuilder obj = LinearExpr.newBuilder();
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
        // Check that the problem has a feasible solution.
        if (status == CpSolverStatus.OPTIMAL || status == CpSolverStatus.FEASIBLE) {
            System.out.println("Total cost: " + solver.objectiveValue() + "\n");
            for (int worker : allWorkers) {
                for (int task : allTasks) {
                    if (solver.booleanValue(x[worker][task])) {
                        System.out.println("Worker " + worker + " assigned to task " + task
                                + ".  Cost: " + costs[worker][task]);
                    }
                }
            }
        } else {
            System.err.println("No solution found.");
        }
    }
}
