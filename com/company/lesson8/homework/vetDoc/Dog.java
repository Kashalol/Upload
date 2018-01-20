package com.company.lesson8.homework.vetDoc;

public class Dog extends Animal {
    private int barkLoudness;

    public Dog() {
    }

    public Dog(String food, String location, int barkLoudness) {
        super(food, location);
        this.barkLoudness = barkLoudness;
    }

    public int getBarkLoudness() {
        return barkLoudness;
    }

    public void setBarkLoudness(int barkLoudness) {
        this.barkLoudness = barkLoudness;
    }

    public void makeNoise() {
        System.out.println("ГАВ!");
    }

    public void eat() {
        System.out.println("мясные продукты");
    }
}
