package com.company.lesson8.homework.venicles;

import com.company.lesson8.homework.details.Engine;
import com.company.lesson8.homework.proffesions.Driver;

class Lorry extends Car {
    private int carrying;

    public Lorry(String brand, String carClass, int weight, Engine engine, Driver driver, int carrying) {
        super(brand, carClass, weight, engine, driver);
        this.carrying = carrying;
    }

    public Lorry() {
    }

    public int getCarrying() {
        return carrying;
    }

    public void setCarrying(int carrying) {
        this.carrying = carrying;
    }
}