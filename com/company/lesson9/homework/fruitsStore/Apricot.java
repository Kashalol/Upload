package com.company.lesson9.homework.fruitsStore;

import java.util.Objects;

public class Apricot extends Fruit {
    private double apricotPrice;

    public Apricot(double weight, double price) {
        super(weight);
        this.apricotPrice = price;
    }

    public Apricot() {
    }

    public double getApricotPrice() {
        return apricotPrice;
    }

    public void setPrice(double price) {
        this.apricotPrice = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Apricot apricot = (Apricot) o;
        return Double.compare(apricot.apricotPrice, apricotPrice) == 0;
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), apricotPrice);
    }

    @Override
    public String toString() {
        return "Apricot{" +
                "apricotPrice=" + apricotPrice +
                "} " + super.toString();
    }

    @Override
    double priceReturn(double weight) {
        return apricotPrice * weight;
    }
}
