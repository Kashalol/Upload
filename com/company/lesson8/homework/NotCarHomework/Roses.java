package com.company.lesson8.homework.NotCarHomework;

class Roses extends Flower {
    private double height;

    public Roses(String country, int expDate, double price, double heiggt) {
        super(country, expDate, price);
        this.height = heiggt;
    }

    public Roses() {
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double heiggt) {
        this.height = heiggt;
    }
}
