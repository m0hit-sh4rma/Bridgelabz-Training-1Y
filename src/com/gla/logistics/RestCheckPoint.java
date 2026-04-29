package com.gla.logistics;

public class RestCheckPoint extends CheckPoint {

    public RestCheckPoint(String id, String location, double distance, int expected, int actual) {
        super(id,location,distance,expected,actual);
    }

    @Override
    public boolean isCritical() {
        return false;
    }

    @Override
    public String getType() {
        return "Rest";
    }

    @Override
    public double calculatePenalty() {
        int delay = actualDuration - expectedDuration;

        if(delay > 30) {
            return delay * 0.5;
        }
        return 0;
    }
}