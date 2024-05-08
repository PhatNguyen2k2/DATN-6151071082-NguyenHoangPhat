package com.phat.ctrs.utils;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;

import org.springframework.format.datetime.DateFormatter;

import com.phat.ctrs.model.Route;

import ch.qos.logback.classic.pattern.DateConverter;

public class OrToolsHelper {
    public static int[][] buildCostMatrix(List<Integer> routeLength, List<Integer> costPartner) {
        int ncc = costPartner.size();
        int route = routeLength.size();

        int[][] costMatrix = new int[ncc][route];

        for (int i = 0; i < ncc; i++) {
            for (int j = 0; j < route; j++) {
                costMatrix[i][j] = costPartner.get(i) * routeLength.get(j);
            }
        }
        return costMatrix;
    }

    public static int convertTime(Date currentTime, Date time) {
        long seconds = currentTime.getTime() / 1000;
        long timeSecond = time.getTime() / 1000;
        return (int) (timeSecond - seconds);
    }

    public static Date localDateTimeToDate(LocalDateTime time) {
        return Date.from(time.atZone(ZoneId.systemDefault()).toInstant());
    }

    public static int[][] buildShiftOfRoute(List<Route> routes) {
        @SuppressWarnings("deprecation")
        Date currentTime = new Date(2024, 4, 1);
        int routesLen = routes.size();
        int[][] shiftOfRoute = new int[routesLen][2];
        for (int i = 0; i < routesLen; i++) {
            Route r = routes.get(i);
            int start = convertTime(currentTime, localDateTimeToDate(r.getBeginTime()));
            int end = convertTime(currentTime, localDateTimeToDate(r.getEndTime()));
            shiftOfRoute[i][0] = start;
            shiftOfRoute[i][1] = end;
        }
        return shiftOfRoute;
    }
}
