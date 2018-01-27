package com.company.lesson10.homework.clothes;

public class Pants extends Clothes implements MenClothes, WomenClothes {

    public Pants(Sizes size, int price, String color) {
        super(size, price, color);
    }

    @Override
    public String toString() {
        return "Pants{" +
                "size=" + getSize() +
                "} " + super.toString();
    }

    @Override
    public void putClothesOnMen() {
        System.out.println("Это мужские штаны");
        System.out.println("Размер : " + getSize());
        System.out.println("Цвет : " + getColor());
        System.out.println("Цена : " + getPrice());
    }

    @Override
    public void putClothesOnWomen() {
        System.out.println("Это женские штаны");
        System.out.println("Размер : " + getSize());
        System.out.println("Цвет : " + getColor());
        System.out.println("Цена : " + getPrice());
    }
}
