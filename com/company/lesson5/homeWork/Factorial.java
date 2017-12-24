package com.company.lesson5.homeWork;

public class Factorial {
    public static void main(String[] args) {
        int limit = 7;
        int randomNumber = (int) (Math.random() * limit);
        int result = factor(randomNumber);
        System.out.println("Случайное выбраное число " + randomNumber);
        System.out.println("Факториал числа " + randomNumber + " равен " + result);
    }

    public static int factor(int i2) {
        int i3 = 1;
        for (int i = 1; i <= i2; i++) {
            i3 = i3 * i;
        }
        return i3;
    }
}