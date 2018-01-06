package com.company.lesson3.homeWork;

import java.util.Scanner;

public class Adding2 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        int a = inputed(sc1);
        int b = inputed(sc1);
        int result = a + b;
        System.out.println(a + " + " + b + " = " + result);
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