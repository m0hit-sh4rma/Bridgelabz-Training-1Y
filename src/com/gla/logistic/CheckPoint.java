package com.gla.logistic;

abstract class CheckPoint {
    String id;
    String name;

    double distanceFromPrevious;
    double expectedTime;
    double actualTime;;

    public CheckPoint(String id, String name, double distanceFromPrevious, double expectedTime, double actualTime
    ){
        this.id = id;
        this.name = name;
        this.distanceFromPrevious = distanceFromPrevious;
        this.expectedTime = expectedTime;
        this.actualTime = actualTime;
    }
    abstract double computePenalty();
}
