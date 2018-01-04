package com.company.lesson7.classExercise;

class Car {
    String brand;
    String model;

    void showPrice() {
        System.out.println(brand + " " + model + " costs too much");
    }

    void maxSpeed() {
        System.out.println(brand + " " + model + " rides too fast");
    }

}

public class ClassObjects {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();
        car1.brand = "Mazda";
        car2.brand = "Toyota";
        car1.model = "MX-5";
        car2.model = "RX350";
        car1.showPrice();
        car2.showPrice();
        car1.maxSpeed();
        car2.maxSpeed();
    }
}
