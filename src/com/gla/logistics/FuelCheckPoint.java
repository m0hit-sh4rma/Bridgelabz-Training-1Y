package com.gla.logistics;

public class FuelCheckPoint extends CheckPoint {

    public FuelCheckPoint(String id, String location, double distance, int expected, int actual) {

        super(id,location,distance,expected,actual);
    }

    @Override
    public boolean isCritical() {
        return true;
    }

    @Override
    public String getType() {
        return "Fuel";
    }

    @Override
    public double calculatePenalty() {

        if(isDelayed()) {
            return 10;
        }

        return 0;
    }
}