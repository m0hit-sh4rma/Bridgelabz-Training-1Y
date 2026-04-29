package com.gla.logistics;

public class Main {

    public static void main(String[] args) {

        Driver driver = new Driver("D1204", "Kavita Nair");

        driver.routeHistory.addCheckpoint(new DeliveryCheckPoint("C1", "Warehouse A", 30, 50, 60));

        driver.routeHistory.addCheckpoint(new FuelCheckPoint("C2", "Pump 12", 20, 25, 25));

        driver.routeHistory.addCheckpoint(new RestCheckPoint("C3", "Motel X", 10, 40, 4));

        driver.routeHistory.addCheckpoint(new DeliveryCheckPoint("C4", "Client Hub", 60, 45, 6));

        driver.showSummary();
    }
}