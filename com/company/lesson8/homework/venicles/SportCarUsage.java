package com.company.lesson8.homework.venicles;

import com.company.lesson8.homework.details.Engine;
import com.company.lesson8.homework.proffesions.Driver;

class SportCar extends Car {
    private double maxSpeed;

    public SportCar() {

    }

    public SportCar(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public SportCar(String brand, String carClass, int weight, Engine engine, Driver driver, double maxSpeed) {
        super(brand, carClass, weight, engine, driver);
        this.maxSpeed = maxSpeed;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}