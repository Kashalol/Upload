package com.company.lesson10.homework.clothes;

import java.util.Objects;

public abstract class Clothes {
    private Sizes size;
    private int price;
    private String color;

    public Clothes() {
    }

    public Clothes(Sizes size, int price, String color) {
        this.size = size;
        this.price = price;
        this.color = color;
    }

    public Clothes(Sizes size) {
        this.size = size;
    }

    public Sizes getSize() {
        return size;
    }

    public void setSize(Sizes size) {
        this.size = size;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Clothes clothes = (Clothes) o;
        return price == clothes.price &&
                size == clothes.size &&
                Objects.equals(color, clothes.color);
    }

    @Override
    public int hashCode() {

        return Objects.hash(size, price, color);
    }

    @Override
    public String toString() {
        return "Clothes{" +
                "size=" + size +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
