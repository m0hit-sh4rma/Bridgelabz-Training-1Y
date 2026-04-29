package com.gla.logistics;

abstract class CheckPoint {

    String checkpointId;
    String locationName;
    double distanceFromLast;
    int expectedDuration;
    int actualDuration;

    public CheckPoint(String checkpointId, String locationName, double distanceFromLast, int expectedDuration, int actualDuration) {
        this.checkpointId = checkpointId;
        this.locationName = locationName;
        this.distanceFromLast = distanceFromLast;
        this.expectedDuration = expectedDuration;
        this.actualDuration = actualDuration;
    }

    public boolean isDelayed() {
        return actualDuration > expectedDuration;
    }

    public abstract boolean isCritical();

    public abstract String getType();

    public abstract double calculatePenalty();
}