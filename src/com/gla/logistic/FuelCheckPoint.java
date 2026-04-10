package com.gla.logistic;

public class FuelCheckPoint extends CheckPoint{
    public FuelCheckPoint (String id, String name, double distance, double expected, double actual){
        super (id, name, distance, expected, actual);
    }

    @Override
    double computePenalty(){
        if(actualTime > expectedTime){
            return 10;
        }
        return 0;
    }
}
