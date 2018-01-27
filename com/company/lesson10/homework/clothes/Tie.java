package com.company.lesson10.homework.clothes;

public class Tie extends Clothes implements MenClothes {

    public Tie(Sizes size, int price, String color) {
        super(size, price, color);
    }

    @Override
    public String toString() {
        return "Tie{" +
                "size=" + getSize() +
                "} " + super.toString();
    }

    @Override
    public void putClothesOnMen() {
        System.out.println("Это мужской галстук");
        System.out.println("Размер : " + getSize());
        System.out.println("Цвет : " + getColor());
        System.out.println("Цена : " + getPrice());
    }
}
