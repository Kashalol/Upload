package com.company.lesson10.homework.clothes;

public class Skirt extends Clothes implements WomenClothes {

    public Skirt(Sizes size, int price, String color) {
        super(size, price, color);
    }

    @Override
    public String toString() {
        return "Skirt{" +
                "size=" + getSize() +
                "} " + super.toString();
    }

    @Override
    public void putClothesOnWomen() {
        System.out.println("Это женская юбка");
        System.out.println("Размер : " + getSize());
        System.out.println("Цвет : " + getColor());
        System.out.println("Цена : " + getPrice());
    }
}
