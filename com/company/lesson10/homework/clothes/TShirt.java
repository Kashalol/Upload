package com.company.lesson10.homework.clothes;

public class TShirt extends Clothes implements MenClothes, WomenClothes {

    public TShirt(Sizes size, int price, String color) {
        super(size, price, color);
    }

    @Override
    public String toString() {
        return "TShirt{" +
                "size=" + getSize() +
                "} " + super.toString();
    }

    @Override
    public void putClothesOnMen() {
        System.out.println("Это мужская футболка");
        System.out.println("Размер : " + getSize());
        System.out.println("Цвет : " + getColor());
        System.out.println("Цена : " + getPrice());
    }

    @Override
    public void putClothesOnWomen() {
        System.out.println("Это женская футболка");
        System.out.println("Размер : " + getSize());
        System.out.println("Цвет : " + getColor());
        System.out.println("Цена : " + getPrice());
    }
}
