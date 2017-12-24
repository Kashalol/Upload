package com.company.lesson3.homeWork;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Введите целое число");
        if (sc1.hasNextInt()) {
            int i = sc1.nextInt();
            if ((i % 2) == 0) {
                System.out.println("Число " + i + " является четным");
            } else {
                System.out.println("Число " + i + " является нечетным");
            }
        } else {
            System.out.println("Ошибка ввода");
        }
    }
}
