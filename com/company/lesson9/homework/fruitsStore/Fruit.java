package com.company.lesson9.homework.fruitsStore;

import java.util.Objects;

abstract class Fruit {
    private double weight;

    public Fruit(double weight) {
        this.weight = weight;
    }

    public Fruit() {
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fruit fruit = (Fruit) o;
        return Double.compare(fruit.weight, weight) == 0;
    }

    @Override
    public int hashCode() {

        return Objects.hash(weight);
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "weight=" + weight +
                '}';
    }

    public final void printManufacturerInfo() {
        System.out.println("Made in Ukraine");
    }

    abstract double priceReturn(double weight);

    public static double fruitSumm(Fruit... fruits) {
        double result = 0;
        for (Fruit fruit : fruits) {
            result += fruit.priceReturn(fruit.getWeight());
        }
        return result;
    }
}
