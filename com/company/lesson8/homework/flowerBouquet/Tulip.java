package com.company.lesson8.homework.flowerBouquet;

import java.util.Objects;

class Tulip extends Flower {
    private int amountOfColors;

    public Tulip(String country, int expDate, double price, int amountOfColors) {
        super(country, expDate, price);
        this.amountOfColors = amountOfColors;
    }

    public Tulip() {
    }

    public int getAmountOfColors() {
        return amountOfColors;
    }

    public void setAmountOfColors(int amountOfColors) {
        this.amountOfColors = amountOfColors;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Tulip tulip = (Tulip) o;
        return amountOfColors == tulip.amountOfColors;
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), amountOfColors);
    }

    @Override
    public String toString() {
        return "Tulip{" +
                "amountOfColors=" + amountOfColors +
                '}';
    }
}
