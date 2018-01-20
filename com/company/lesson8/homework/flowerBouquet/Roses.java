package com.company.lesson8.homework.flowerBouquet;

import java.util.Objects;

class Roses extends Flower {
    private double height;

    public Roses(String country, int expDate, double price, double height) {
        super(country, expDate, price);
        this.height = height;
    }

    public Roses() {
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Roses roses = (Roses) o;
        return Double.compare(roses.height, height) == 0;
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), height);
    }

    @Override
    public String toString() {
        return "Roses{" +
                "height=" + height +
                '}';
    }
}
