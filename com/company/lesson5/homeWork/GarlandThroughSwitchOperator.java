package com.company.lesson5.homeWork;

import java.util.Scanner;

public class GarlandThroughSwitchOperator {
    public static void main(String[] args) {
        System.out.println("Представьте,что у вас есть гирлянда с 32 лампочками");
        System.out.println("Введите любое целое число,которое превратится в Вашу гирлянду");
        Scanner sc1 = new Scanner(System.in);
        if (sc1.hasNextInt()) {
            int currentGarland = sc1.nextInt();
            System.out.println("Выберите режим работы гилянды задав номер действия");
            System.out.println("1 Мигание");
            System.out.println("2 Бегущая строка влево");
            System.out.println("3 Бегущая строка вправо");
            System.out.println("4 Проверка горения первой лампочки");
            System.out.println("5 Просто включить");
            if (sc1.hasNextInt()) {
                int mode = sc1.nextInt();
                switch (mode) {
                    case 1:
                        switching(currentGarland);
                        break;
                    case 2:
                        movingLeft(currentGarland);
                        break;
                    case 3:
                        movingRight(currentGarland);
                        break;
                    case 4:
                        firstLamp(currentGarland);
                        break;
                    case 5:
                        garlandState(currentGarland);
                        break;
                }
            } else {
                System.out.println("Ошибка ввода");
            }
        }
    }

    static void switching(int currentGarland) {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Введите количество миганий");
        if (sc1.hasNextInt()) {
            int modeUsages = sc1.nextInt();
            for (int i = 0; i < modeUsages; i++) {
                currentGarland = ~currentGarland;
                printingResult(currentGarland);
            }
        } else {
            System.out.println("Ошибка ввода");
        }
    }

    static void movingLeft(int currentGarland) {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Введите количество смещений");
        if (sc1.hasNextInt()) {
            int modeUsages = sc1.nextInt();
            for (int i = 0; i < modeUsages; i++) {
                currentGarland = currentGarland << 1;
                printingResult(currentGarland);
            }
        } else {
            System.out.println("Ошибка ввода");
        }
    }

    static void movingRight(int currentGarland) {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Введите количество смещений");
        if (sc1.hasNextInt()) {
            int modeUsage = sc1.nextInt();
            for (int i = 0; i < modeUsage; i++) {
                currentGarland = currentGarland >> 1;
                printingResult(currentGarland);
            }
        } else {
            System.out.println("Ошибка ввода");
        }
    }

    static void firstLamp(int currentGarland) {
        if ((currentGarland & 1) == 1) {
            System.out.println("Первая лампочка горит");
        } else {
            System.out.println("Первая лампа не горит");
        }
    }

    static int garlandState(int currentGarland) {
        System.out.println("Вот так выглядит ваша гирлянда сейчас");
        printingResult(currentGarland);
        return currentGarland;
    }

    private static void printingResult(int currentGarland) {
        String trans = Integer.toBinaryString(currentGarland);
        addingZero(trans);
        System.out.println(trans);
    }

    private static void addingZero(String trans) {
        int dlinaStroki = trans.length();
        for (int i = 32; dlinaStroki < i; dlinaStroki++) {
            System.out.print("0");
        }
    }
}