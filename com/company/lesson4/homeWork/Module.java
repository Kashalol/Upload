package com.company.lesson4.homeWork;

import java.util.Scanner;

public class Module {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Введите три вещественных числа");
        if (sc1.hasNextDouble()) {
            double d1 = inputDouble(sc1.nextDouble());
            double d2 = inputDouble(sc1.nextDouble());
            double d3 = inputDouble(sc1.nextDouble());
            if ((d1 < d2) && (d1 < d3)) {
                System.out.println("Наименьшее число по модулю " + d1);
            } else if ((d2 < d3) && (d2 < d1)) {
                System.out.println("Наименьшее число по модулю " + d2);
            } else {
                System.out.println("Наименьшее число по модулю " + d3);
            }
        } else {
            System.out.println("Ошибка ввода");
        }
    }

    public static double inputDouble(double dInput) {
        dInput = dInput < 0 ? -dInput : dInput;
        return dInput;
    }
}