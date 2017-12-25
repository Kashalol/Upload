package com.company.lesson5.classExercise;

import java.util.Scanner;

public class FromOneToTen {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        if (scan.hasNextInt()) {
            int i = scan.nextInt();
            if (i >= 0 && i < 10) {
                System.out.println("Положительное число меньше 10");
            } else {
                System.out.println("Число больше 10 или отрицательное");
            }
        }
    }
}
