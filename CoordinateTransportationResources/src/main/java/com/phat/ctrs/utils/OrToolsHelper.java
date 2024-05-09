package com.phat.ctrs.utils;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import com.phat.ctrs.model.Route;

public class OrToolsHelper {
    public static int[][] buildCostMatrix(List<Integer> routeLength, List<Integer> costPartner) {
        int ncc = costPartner.size();
        int route = routeLength.size();

        int[][] costMatrix = new int[ncc][route];

        int[] routeLengthArray = routeLength.stream().mapToInt(Integer::intValue).toArray();
        int[] costPartnerArray = costPartner.stream().mapToInt(Integer::intValue).toArray();

        for (int i = 0; i < ncc; i++) {
            int partnerCost = costPartnerArray[i];
            for (int j = 0; j < route; j++) {
                costMatrix[i][j] = partnerCost * routeLengthArray[j];
            }
        }
        return costMatrix;
    }

    public static int[] buildProvideAbility(List<Integer> list) {
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }

    public static int[][] buildShiftOfRoute(List<Route> routes) {
        int routesLen = routes.size();
        int[][] shiftOfRoute = new int[routesLen][2];
        for (int i = 0; i < routesLen; i++) {
            Route r = routes.get(i);
            int start = r.getBeginTime().getHour() * 3600 + r.getBeginTime().getMinute() * 60;
            int end = r.getEndTime().getHour() * 3600 + r.getEndTime().getMinute() * 60;
            shiftOfRoute[i][0] = start;
            shiftOfRoute[i][1] = end;
        }
        return shiftOfRoute;
    }

    public static List<LocalTime[]> calculateOuTimes(LocalTime[] blockedTimes) {
        List<LocalTime[]> result = new ArrayList<>();
        LocalTime[] timeFirst = { LocalTime.of(0, 0, 0), LocalTime.of(0, 0, 0) };
        LocalTime[] timeLast = { LocalTime.of(23, 59, 0), LocalTime.of(23, 59, 0) };
        result.add(timeFirst);
        result.add(blockedTimes);
        result.add(timeLast);

        List<LocalTime[]> avaiTimes = new ArrayList<>();
        for (int i = 1; i < result.size(); i++) {
            LocalTime[] prev = result.get(i - 1);
            LocalTime[] curr = result.get(i);

            int prevEndMinuteOfDay = prev[1].getHour() * 60 + prev[1].getMinute();
            int currStartMinuteOfDay = curr[0].getHour() * 60 + curr[0].getMinute();

            if (currStartMinuteOfDay > prevEndMinuteOfDay) {
                LocalTime[] time = { prev[1], curr[0] };
                avaiTimes.add(time);
            }
        }
        return avaiTimes;
    }

    public static int[][][] buildServeTimeOfPartner(List<List<LocalTime[]>> partner) {
        int partnerLen = partner.size();
        int[][][] serveTime = new int[partnerLen][2][2];

        for (int i = 0; i < partnerLen; i++) {
            List<LocalTime[]> partnerShifts = partner.get(i);
            for (int j = 0; j < 2; j++) {
                LocalTime[] shift = partnerShifts.get(j);
                serveTime[i][j][0] = shift[0].getHour() * 3600 + shift[0].getMinute() * 60;
                serveTime[i][j][1] = shift[1].getHour() * 3600 + shift[1].getMinute() * 60;
            }
        }
        return serveTime;
    }
}
