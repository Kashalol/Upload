package com.company.lesson9.homework.FruitStore;

import java.util.Objects;

public class Apple extends Fruit {
    double applePrice;

    public Apple(double weight, double price) {
        super(weight);
        this.applePrice = price;
    }

    public Apple() {
    }

    public double getApplePrice() {
        return applePrice;
    }

    public void setPrice(double price) {
        this.applePrice = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Apple apple = (Apple) o;
        return Double.compare(apple.applePrice, applePrice) == 0;
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), applePrice);
    }

    @Override
    public String toString() {
        return "Apple{" +
                "price=" + applePrice +
                ", weight=" + weight +
                '}';
    }

    @Override
    double priceReturn(double weight) {
        double result = applePrice * weight;
        return result;
    }
}
