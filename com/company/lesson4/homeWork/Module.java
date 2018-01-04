package com.company.lesson4.homeWork;

import java.util.Scanner;

public class Module {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Введите три вещественных числа");
        double d1 = inputDouble(sc1);
        double d2 = inputDouble(sc1);
        double d3 = inputDouble(sc1);
        if (d1 < d2 && d1 < d3) {
            System.out.println("Наименьшее число по модулю " + d1);
        } else if (d2 < d3 && d2 < d1) {
            System.out.println("Наименьшее число по модулю " + d2);
        } else {
            System.out.println("Наименьшее число по модулю " + d3);
        }
    }

    public static double inputDouble(Scanner sc1) {
        if (sc1.hasNextDouble()) {
            double dInput = sc1.nextDouble();
            dInput = dInput < 0 ? -dInput : dInput;
            return dInput;
        } else {
            System.out.println("Ошибка ввода");
            return 0;
        }
    }
}