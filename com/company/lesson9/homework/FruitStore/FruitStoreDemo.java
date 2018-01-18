package com.company.lesson9.homework.FruitStore;

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
        double summ = 0.0;
        for (Fruit fruit : fruits) {
            summ += fruit.priceReturn(fruit.getWeight());
        }
        System.out.println("Общая стоимость проданных фруктов составляет " + summ);
        System.out.println("Стоимость проданных яблок : "+apllesSumm(apple1,apple2,apple3));
        System.out.println("Стоимость проданных груш : "+pearSumm(pear1,pear2,pear3));
        System.out.println("Стоимость проданных персиков : "+apricotSumm(apricot1,apricot2,apricot3));
    }

    public static double apllesSumm(Apple... apples) {
        double result = 0;
        for (Apple apple : apples) {
            result += apple.priceReturn(apple.getWeight());
        }
        return result;
    }

    public static double pearSumm(Pear... pears) {
        double result = 0;
        for (Pear pear : pears) {
            result += pear.priceReturn(pear.getWeight());
        }
        return result;
    }
    public static double apricotSumm(Apricot... apricots) {
        double result = 0;
        for (Apricot apricot : apricots) {
            result += apricot.priceReturn(apricot.getWeight());
        }
        return result;
    }

}
