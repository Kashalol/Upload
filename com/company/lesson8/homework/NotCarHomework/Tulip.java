package com.company.lesson8.homework.NotCarHomework;

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
}
