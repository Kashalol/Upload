package com.company.lesson9.homework.fruitsStore;

public class FruitStoreDemo {
    public static void main(String[] args) {
        Apple apple1 = new Apple(0.34, 26.4);
        Apple apple2 = new Apple(0.43, 26.4);
        Apple apple3 = new Apple(0.276, 26.4);
        Pear pear1 = new Pear(0.26, 45.3);
        Pear pear2 = new Pear(0.221, 45.3);
        Pear pear3 = new Pear(0.306, 45.3);
        Apricot apricot1 = new Apricot(0.347, 87.4);
        Apricot apricot2 = new Apricot(0.368, 87.4);
        Apricot apricot3 = new Apricot(0.309, 87.4);
        Fruit[] fruits = {apple1, apple2, apple3, pear1, pear2, pear3, apricot1, apricot2, apricot3};
        System.out.print("Общая стоимость проданных фруктов составляет " + Fruit.fruitSumm(fruits));
        System.out.println("Стоимость проданных яблок : " + Apple.fruitSumm(apple1, apple2, apple3));
        System.out.println("Стоимость проданных груш : " + Pear.fruitSumm(pear1, pear2, pear3));
        System.out.println("Стоимость проданных персиков : " + Apricot.fruitSumm(apricot1, apricot2, apricot3));
        apple1.printManufacturerInfo();
        pear2.printManufacturerInfo();
        apricot3.printManufacturerInfo();
    }
}