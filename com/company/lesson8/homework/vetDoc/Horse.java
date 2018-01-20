package com.company.lesson8.homework.vetDoc;

public class Horse extends Animal {
    private double height;

    public Horse() {
    }

    public Horse(String food, String location, double height) {
        super(food, location);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void makeNoise() {
        System.out.println("Иго-го!");
    }

    public void eat() {
        System.out.println("продукты растительного происхождения");
    }

    public void sleep(){
        System.out.println("Лошадь спит в стойле");
    }
}
