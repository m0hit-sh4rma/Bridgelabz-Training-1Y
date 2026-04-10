package com.gla.logistic;

public class DeliveryCheckPoint extends CheckPoint{
    public DeliveryCheckPoint (String id, String name, double distance, double expected, double actual){
        super(id, name, distance, expected, actual);
    }

    @Override
    double computePenalty(){
        if(actualTime <= expectedTime){
            return 0;
        }
        else{
            return (actualTime - expectedTime) * 2;
        }
    }
}
