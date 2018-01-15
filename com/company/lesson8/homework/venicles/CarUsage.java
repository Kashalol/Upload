package com.company.lesson8.homework.venicles;

import com.company.lesson8.homework.details.Engine;
import com.company.lesson8.homework.proffesions.Driver;

class Car{
    private String brand;
    private String carType;
    private int weight;
    private Engine engine;
    private Driver driver;

    public Car() {
    }

    public Car(String brand, String carType, int weight, Engine engine, Driver driver) {
        this.brand = brand;
        this.carType = carType;
        this.weight = weight;
        this.engine = engine;
        this.driver = driver;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }
    public void start(){
        System.out.println("Поехали");
    }
    public void stop(){
        System.out.println("Останавливаемся");
    }
    public void turnLeft(){
        System.out.println("Поворачиваем налево");
    }
    public void turnRight(){
        System.out.println("Поворачиваем направо");
    }
    public void fullInfo(){
        System.out.println("Данные об автомобиле");
        System.out.println("Проивзодитель автомобиля : "+brand);
        System.out.println("Класс автомобиля : "+carType);
        System.out.println("Вес автомобиля : "+weight);
        System.out.println("Данные о двигателе");
        System.out.println("Мощность двигателя : "+engine.getPower());
        System.out.println("Проивзодитель двигателя : "+engine.getManufacturer());
        System.out.println("Данные о водителе");
        System.out.println("ФИО : "+ driver.getFullName());
        System.out.println("Опыт вождения"+driver.getDrivingExperience());
    }
}

public class CarUsage {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.start();
        car1.stop();
        car1.turnLeft();
        car1.turnRight();
        car1.fullInfo();
    }
}
