package com.gla.logistics;

public class Driver {

    String driverId;
    String name;

    RouteLinkedList<CheckPoint> routeHistory;

    public Driver(String driverId,String name) {
        this.driverId=driverId;
        this.name=name;
        routeHistory = new RouteLinkedList<>();
    }


    public void showSummary() {

        System.out.println("Driver: " + driverId + " - " + name);

        System.out.println("\nRoute Summary:");

        routeHistory.printRoute();

        double distance= routeHistory.computeTotalDistance();

        double penalty= routeHistory.computeTotalPenalty();

        double routeScore= distance-penalty;

        System.out.println("\nTotal Distance: " + distance + " km");

        System.out.println("Total Penalty: " + penalty);

        System.out.println("Route Score: " + routeScore);

        System.out.println(routeHistory.criticalCheck() ? "Critical Route Check: All required checkpoints present" : "Critical Route Check Failed");
    }
}
