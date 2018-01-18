package com.company.lesson9.homework.FruitStore;

import java.util.Objects;

public class Pear extends Fruit {
    double pearPrice;

    public Pear(double weight, double price) {
        super(weight);
        this.pearPrice = price;
    }

    public Pear() {
    }

    public double getPearPrice() {
        return pearPrice;
    }

    public void setPrice(double price) {
        this.pearPrice = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Pear pear = (Pear) o;
        return Double.compare(pear.pearPrice, pearPrice) == 0;
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), pearPrice);
    }

    @Override
    public String toString() {
        return "Pear{" +
                "price=" + pearPrice +
                ", weight=" + weight +
                '}';
    }

    @Override
    double priceReturn(double weight) {
        double result = pearPrice * weight;
        return result;
    }
}
