package com.company.lesson8.homework.NotCarHomework;

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
}
