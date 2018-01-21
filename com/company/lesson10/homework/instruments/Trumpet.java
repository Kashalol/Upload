package com.company.lesson10.homework.instruments;

import java.util.Objects;

public class Trumpet implements Instrument {
    private double diam;

    public Trumpet(double diam) {
        this.diam = diam;
    }

    public Trumpet() {
    }

    public double getDiam() {
        return diam;
    }

    public void setDiam(double diam) {
        this.diam = diam;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Trumpet trumpet = (Trumpet) o;
        return Double.compare(trumpet.diam, diam) == 0;
    }

    @Override
    public int hashCode() {

        return Objects.hash(diam);
    }

    @Override
    public String toString() {
        return "Trumpet{" +
                "diam=" + diam +
                '}';
    }

    @Override
    public void play() {
        System.out.println("Играет труба диаметром " + getDiam() + " сантиметров");
    }
}
