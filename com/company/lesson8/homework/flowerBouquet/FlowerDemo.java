package com.company.lesson8.homework.flowerBouquet;

public class FlowerDemo {


    public static void main(String[] args) {
        Daisy daisy1 = new Daisy("Ukraine", 26, 0.85, "Pink");
        Daisy daisy2 = new Daisy("Ukraine", 26, 0.82, "Red");
        Tulip tulip1 = new Tulip("Netherlands", 24, 1.96, 1);
        Tulip tulip2 = new Tulip("Netherlands", 24, 2.47, 4);
        Clove clove1 = new Clove("Romania", 25, 0.07, 12.5);
        Clove clove2 = new Clove("Romania", 25, 0.04, 10.1);
        Roses rose1 = new Roses("England", 22, 3.78, 46);
        Roses rose2 = new Roses("England", 22, 4.87, 58);
        Flower[] bouquetOfRoses = {rose1, rose1, rose1, rose1, rose2, rose2, rose2, rose2};
        Flower[] bouquetDifferent = {daisy1, daisy2, daisy1, daisy2, clove2, clove2, clove1, tulip2};
        Flower[] bouquetOfTulips = {tulip1, tulip1, tulip1, tulip1, tulip2};
        Flower.bouquetPrice(bouquetOfRoses);
        Flower.bouquetPrice(bouquetDifferent);
        Flower.bouquetPrice(bouquetOfTulips);
        Flower.setFlowersSold(bouquetOfRoses.length + bouquetDifferent.length + bouquetOfTulips.length);
        System.out.println("Количество проданных цветов : " + Flower.getFlowersSold());
    }
}
