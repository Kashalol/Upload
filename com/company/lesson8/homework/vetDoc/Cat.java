package com.company.lesson8.homework.vetDoc;

public class Cat extends Animal {
    private int murchalnikWorkTime;

    public Cat() {
    }

    public Cat(String food, String location, int murchalnikWorkTime) {
        super(food, location);
        this.murchalnikWorkTime = murchalnikWorkTime;
    }

    public int getMurchalnikWorkTime() {
        return murchalnikWorkTime;
    }

    public void setMurchalnikWorkTime(int murchalnikWorkTime) {
        this.murchalnikWorkTime = murchalnikWorkTime;
    }

    public void makeNoise() {
        System.out.println("Мяу!");
    }

    public void eat() {
        System.out.println("мясные,молочные и рыбные продукты");
    }
}
