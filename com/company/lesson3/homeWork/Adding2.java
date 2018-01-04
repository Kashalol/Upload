package com.company.lesson3.homeWork;

import java.util.Scanner;

public class Adding2 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        int i1 = inputed(sc1);
        int i2 = inputed(sc1);
        int i3 = i1 + i2;
        System.out.println(i1 + " + " + i2 + " = " + i3);
    }

    public static int inputed(Scanner sc1) {
        System.out.println("Введите число для получения суммы");
        int i;
        if (sc1.hasNextInt()) {
            i = sc1.nextInt();
        } else {
            System.out.println("Ошибка ввода");
            return 0;
        }
        return i;
    }
}