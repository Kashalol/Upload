package com.company.lesson5.homeWork;

import java.util.Scanner;

public class GarlandThroughSwitchOperator {
    public static void main(String[] args) {
        System.out.println("Представьте,что у вас есть гирлянда с 32 лампочками");
        System.out.println("Выберите режим работы гилянды задав номер действия");
        System.out.println("1 Мигание");
        System.out.println("2 Бегущая строка влево");
        System.out.println("3 Бегущая строка вправо");
        System.out.println("4 Проверка горения первой лампочки");
        System.out.println("5 Просто включить");
        Scanner scan = new Scanner(System.in);
        if (scan.hasNextInt()) {
            int mode = scan.nextInt();
            switch (mode) {
                case 1:
                    switching();
                    break;
                case 2:
                    movingLeft();
                    break;
                case 3:
                    movingRight();
                    break;
                case 4:
                    firstLamp();
                    break;
                case 5:
                    garlandState();
                    break;
            }
        } else {
            System.out.println("Ошибка ввода");
        }
    }

    static int switching() {
        System.out.println("Введите любое целое число,которое превратится в Вашу гирлянду");
        Scanner sc1 = new Scanner(System.in);
        int i1 = sc1.nextInt();
        System.out.println("Введите количество миганий");
        int i2 = sc1.nextInt();
        for (int i3 = 0; i3 < i2; i3++) {
            i1 = ~i1;
            String trans = Integer.toBinaryString(i1);
            int dlinaStroki = trans.length();
            for (int i4 = 32; dlinaStroki < i4; dlinaStroki++) {
                System.out.print("0");
            }
            System.out.println(trans);
        }
        return i1;
    }

    static int movingLeft() {
        System.out.println("Введите любое целое число,которое превратится в Вашу гирлянду");
        Scanner sc1 = new Scanner(System.in);
        int i1 = sc1.nextInt();
        System.out.println("Введите количество смещений");
        int i2 = sc1.nextInt();
        for (int i3 = 0; i3 < i2; i3++) {
            i1 = i1 << 1;
            String trans = Integer.toBinaryString(i1);
            int dlinaStroki = trans.length();
            for (int i4 = 32; dlinaStroki < i4; dlinaStroki++) {
                System.out.print("0");
            }
            System.out.println(trans);
        }
        return i1;
    }

    static int movingRight() {
        System.out.println("Введите любое целое число,которое превратится в Вашу гирлянду");
        Scanner sc1 = new Scanner(System.in);
        int i1 = sc1.nextInt();
        System.out.println("Введите количество смещений");
        int i2 = sc1.nextInt();
        for (int i3 = 0; i3 < i2; i3++) {
            i1 = i1 >> 1;
            String trans = Integer.toBinaryString(i1);
            int dlinaStroki = trans.length();
            for (int i4 = 32; dlinaStroki < i4; dlinaStroki++) {
                System.out.print("0");
            }
            System.out.println(trans);
        }
        return i1;
    }

    static int firstLamp() {
        System.out.println("Введите любое целое число,которое превратится в Вашу гирлянду");
        Scanner sc1 = new Scanner(System.in);
        int i1 = sc1.nextInt();
        String trans = Integer.toBinaryString(i1);
        int DlinaStroki = trans.length();
        for (int i4 = 32; DlinaStroki < i4; DlinaStroki++) {
            trans = "0" + trans;
        }
        if (trans.charAt(31) == ('1')) {
            System.out.println("Первая лампочка горит!");
        } else {
            System.out.println("Первая лампочка не горит!");
        }
        return i1;
    }

    static int garlandState() {
        System.out.println("Введите любое целое число,которое превратится в Вашу гирлянду");
        Scanner sc1 = new Scanner(System.in);
        int i1 = sc1.nextInt();
        System.out.println("Вот так выглядит ваша гирлянда сейчас");
        String trans = Integer.toBinaryString(i1);
        int dlinaStroki = trans.length();
        for (int i4 = 32; dlinaStroki < i4; dlinaStroki++) {
            System.out.print("0");
        }
        System.out.println(trans);
        return i1;
    }
}