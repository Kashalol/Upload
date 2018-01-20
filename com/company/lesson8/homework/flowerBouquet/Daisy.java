package com.company.lesson8.homework.flowerBouquet;

import java.util.Objects;

class Daisy extends Flower {
    private String color;

    public Daisy(String country, int expDate, double price, String color) {
        super(country, expDate, price);
        this.color = color;
    }

    public Daisy() {
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Daisy daisy = (Daisy) o;
        return Objects.equals(color, daisy.color);
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), color);
    }

    @Override
    public String toString() {
        return "Daisy{" +
                "color='" + color + '\'' +
                '}';
    }
}
