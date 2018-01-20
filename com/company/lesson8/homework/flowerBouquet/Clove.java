package com.company.lesson8.homework.flowerBouquet;

import java.util.Objects;

class Clove extends Flower {
    private double flowerRadius;

    public Clove(String country, int expDate, double price, double flowerRadius) {
        super(country, expDate, price);
        this.flowerRadius = flowerRadius;
    }

    public Clove() {
    }

    public double getFlowerRadius() {
        return flowerRadius;
    }

    public void setFlowerRadius(double flowerRadius) {
        this.flowerRadius = flowerRadius;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Clove clove = (Clove) o;
        return Double.compare(clove.flowerRadius, flowerRadius) == 0;
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), flowerRadius);
    }

    @Override
    public String toString() {
        return "Clove{" +
                "flowerRadius=" + flowerRadius +
                '}';
    }
}
