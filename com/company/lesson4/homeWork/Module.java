package com.company.lesson4.homeWork;

import java.util.Scanner;

public class Module {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Введите первое вещественное число");
        double d1 = sc1.nextDouble();
        d1 = d1 < 0 ? -d1 : d1;
        System.out.println("Введите второе вещественное число");
        double d2 = sc1.nextDouble();
        d2 = d2 < 0 ? -d2 : d2;
        System.out.println("Введите третье вещественное число");
        double d3 = sc1.nextDouble();
        d3 = d3 < 0 ? -d3 : d3;
        if ((d1 < d2) && (d1 < d3)) {
            System.out.println("Наименьшее число по модулю " + d1);
        } else {
            if ((d2 < d3) && (d2 < d1)) {
                System.out.println("Наименьшее число по модулю " + d2);
            } else {
                System.out.println("Наименьшее число по модулю " + d3);
            }
        }
    }
}