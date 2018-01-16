package com.company.lesson8.homework.NotCarHomework;

class Flower {
    private String country;
    private int expDate;
    private double price;

    public Flower(String country, int expDate, double price) {
        this.country = country;
        this.expDate = expDate;
        this.price = price;
    }

    public Flower() {
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getExpDate() {
        return expDate;
    }

    public void setExpDate(int expDate) {
        this.expDate = expDate;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}