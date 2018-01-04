package com.company.lesson4.homeWork;

import java.util.Scanner;

public class Garland {
    public static void main(String[] args) {
        garlandCreation();
    }

    private static void garlandCreation() { //метод создающий гирлянду из введенного числа
        System.out.println("Представьте,что у вас есть гирлянда с 32 лампочками");
        System.out.println("Введите любое целое число,которое превратится в Вашу гирлянду");
        Scanner sc1 = new Scanner(System.in);
        if (sc1.hasNextInt()) {
            modeChoose(sc1);
        } else {
            System.out.println("Ошибка ввода");
        }
    }

    private static void modeChoose(Scanner sc1) { //метод выбора работа гирлянды
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
                switching(currentGarland);
            }
            if (mode == 2) {
                movingLeft(currentGarland);
            }
            if (mode == 3) {
                movingRight(currentGarland);
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

    static void switching(int i1) { //метод для миганий гирлянды
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Введите количество миганий");
        if (sc1.hasNextInt()) {
            int i2 = sc1.nextInt();
            for (int i3 = 0; i3 < i2; i3++) {
                i1 = ~i1;
                String trans = Integer.toBinaryString(i1);
                addingZero(trans);
                System.out.println(trans);
            }
        } else {
            System.out.println("Ошибка ввода");
        }
    }

    static void movingLeft(int i1) { //метод для сдвига гирлянды влево
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Введите количество смещений");
        if (sc1.hasNextInt()) {
            int i2 = sc1.nextInt();
            for (int i3 = 0; i3 < i2; i3++) {
                i1 = i1 << 1;
                String trans = Integer.toBinaryString(i1);
                addingZero(trans);
                System.out.println(trans);
            }
        } else {
            System.out.println("Ошибка ввода");
        }
    }

    static void movingRight(int i1) { //метод для сдвига гирлянды вправо
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Введите количество смещений");
        if (sc1.hasNextInt()) {
            int i2 = sc1.nextInt();
            for (int i3 = 0; i3 < i2; i3++) {
                i1 = i1 >> 1;
                String trans = Integer.toBinaryString(i1);
                addingZero(trans);
                System.out.println(trans);
            }
        } else {
            System.out.println("Ошибка ввода");
        }
    }

    static void firstLamp(int i1) { //метод проверяющий горение первой лампочки с правого края
        if ((i1 & 1) == 1) {
            System.out.println("Первая лампочка горит");
        } else {
            System.out.println("Первая лампа не горит");
        }
    }

    static int garlandState(int i1) { //метод показывающий гирлянду
        System.out.println("Вот так выглядит ваша гирлянда сейчас");
        String trans = Integer.toBinaryString(i1);
        addingZero(trans);
        System.out.println(trans);
        return i1;
    }

    private static void addingZero(String trans) { //метод добавляющий нули в начало вывода до полной длины
        int dlinaStroki = trans.length();
        for (int i4 = 32; dlinaStroki < i4; dlinaStroki++) {
            System.out.print("0");
        }
    }
}