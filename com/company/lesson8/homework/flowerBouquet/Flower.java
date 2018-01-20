package com.company.lesson8.homework.flowerBouquet;

import java.util.Objects;

public class Flower {
    private static int flowersSold;
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

    public static int getFlowersSold() {
        return flowersSold;
    }

    public static void setFlowersSold(int flowersSold) {
        Flower.flowersSold = flowersSold;
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

    public static void bouquetPrice(Flower[] bouquet) {
        double priceOfBouquet = 0.0;
        for (int i = 0; i < bouquet.length; i++) {
            priceOfBouquet += bouquet[i].getPrice();
        }
        System.out.println("Цена букета составляет : " + priceOfBouquet);
    }
}