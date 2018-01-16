package com.company.lesson8.homework.NotCarHomework;

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
}
