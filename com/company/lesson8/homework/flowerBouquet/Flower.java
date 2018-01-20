package com.company.lesson8.homework.flowerBouquet;

import java.util.Objects;

public class Flower {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flower flower = (Flower) o;
        return expDate == flower.expDate &&
                Double.compare(flower.price, price) == 0 &&
                Objects.equals(country, flower.country);
    }

    @Override
    public int hashCode() {

        return Objects.hash(country, expDate, price);
    }

    @Override
    public String toString() {
        return "Flower{" +
                "country='" + country + '\'' +
                ", expDate=" + expDate +
                ", price=" + price +
                '}';
    }
}