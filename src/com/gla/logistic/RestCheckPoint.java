package com.gla.logistic;

public class RestCheckPoint extends CheckPoint{
    public RestCheckPoint(String id, String name, double distance, double expected, double actual){
        super(id, name, distance, expected, actual);
    }

    @Override
    double computePenalty(){
        if(actualTime - expectedTime > 30){
            return (actualTime - expectedTime) * 0.5;
        }
        return 0;
    }
}
