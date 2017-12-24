package com.company.lesson3.homeWork;

import java.util.Scanner;

public class Adding2 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Введите два целых числа для получения их суммы");
        if (sc1.hasNextInt() & sc2.hasNextInt()) {
            int i1 = sc1.nextInt();
            int i2 = sc2.nextInt();
            int i3 = i1 + i2;
            System.out.println(i1 + " + " + i2 + " = " + i3);
        } else {
            System.out.println("Ошибка ввода");
        }
    }
}
