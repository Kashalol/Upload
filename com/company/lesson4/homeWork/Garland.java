package com.company.lesson4.homeWork;

import java.util.Scanner;

public class Garland {
    public static void main(String[] args) {
        garlandCreation();
    }

    private static void garlandCreation() {
        System.out.println("Представьте,что у вас есть гирлянда с 32 лампочками");
        System.out.println("Введите любое целое число,которое превратится в Вашу гирлянду");
        Scanner sc1 = new Scanner(System.in);
        if (sc1.hasNextInt()) {
            modeChoose(sc1);
        } else {
            System.out.println("Ошибка ввода");
        }
    }

    private static void modeChoose(Scanner sc1) {
        int currentGarland = sc1.nextInt();
        System.out.println("Выберите режим работы гилянды задав номер действия");
        System.out.println("1 Мигание");
        System.out.println("2 Бегущая строка влево");
        System.out.println("3 Бегущая строка вправо");
        System.out.println("4 Проверка горения первой лампочки");
        System.out.println("5 Просто включить");
        if (sc1.hasNextInt()) {
            int mode = sc1.nextInt();
            if (mode == 1) {
                switching(currentGarland, sc1);
            }
            if (mode == 2) {
                movingLeft(currentGarland, sc1);
            }
            if (mode == 3) {
                movingRight(currentGarland, sc1);
            }
            if (mode == 4) {
                firstLamp(currentGarland);
            }
            if (mode == 5) {
                garlandState(currentGarland);
            }
        } else {
            System.out.println("Ошибка ввода");
        }
    }

    static void switching(int currentGarland, Scanner sc1) {
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

    static void movingLeft(int currentGarland, Scanner sc1) {
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

    static void movingRight(int currentGarland, Scanner sc1) {
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

    static void garlandState(int currentGarland) {
        System.out.println("Вот так выглядит ваша гирлянда сейчас");
        printingResult(currentGarland);
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