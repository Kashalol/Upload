package com.company.lesson5.homeWork;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise17GarlandWithArray {
    public static void main(String[] args) {
        modeChoose();
    }

    private static void modeChoose() {
        int[] garland = createGarlandArray();
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
                    switching(garland, scan);
                    break;
                case 2:
                    movingLeft(garland, scan);
                    break;
                case 3:
                    movingRight(garland, scan);
                    break;
                case 4:
                    firstLamp(garland);
                    break;
                case 5:
                    garlandState(garland);
                    break;
            }
        } else {
            System.out.println("Ошибка ввода");
        }
    }

    static void switching(int[] garland2, Scanner sc1) {
        int[] switchedGarland = new int[32];
        int tmp;
        System.out.println("Введите количество миганий");
        if (sc1.hasNextInt()) {
            int switchesAmount = sc1.nextInt();
            for (int i = 0; i < switchesAmount; i++) {
                for (int j = 0; j < 32; j++) {
                    if ((garland2[j]) == 0) {
                        tmp = 1;
                    } else {
                        tmp = 0;
                    }
                    switchedGarland[j] = tmp;
                }
                System.out.println(Arrays.toString(garland2));
                System.out.println(Arrays.toString(switchedGarland));
            }
        } else {
            System.out.println("Ошибка ввода");
        }
    }

    static void movingRight(int[] garland2, Scanner sc1) {
        System.out.println("Введите количество смещений");
        if (sc1.hasNextInt()) {
            int movingNumber = sc1.nextInt();
            for (int i = 0; i < movingNumber; i++) {
                int[] switchedGarland = new int[32];
                System.arraycopy(garland2, 0, switchedGarland, i, (32 - i));
                System.out.println(Arrays.toString(switchedGarland));
            }
        } else {
            System.out.println("Ошибка ввода");
        }
    }

    static void movingLeft(int[] garland2, Scanner sc1) {
        System.out.println("Введите количество смещений");
        if (sc1.hasNextInt()) {
            int movingNumber = sc1.nextInt();
            for (int i = 0; i < movingNumber; i++) {
                int[] switchedGarland = new int[32];
                System.arraycopy(garland2, i, switchedGarland, 0, (32 - i));
                System.out.println(Arrays.toString(switchedGarland));
            }
        } else {
            System.out.println("Ошибка ввода");
        }
    }

    static void firstLamp(int[] garland2) {
        if (garland2[0] == 0) {
            System.out.println("Лампочка не горит");
        } else {
            System.out.println("Лампочка горит");
        }
    }

    static void garlandState(int[] garland2) {
        System.out.println(Arrays.toString(garland2));
    }

    public static int[] createGarlandArray() {
        int[] arr = new int[32];
        int i;
        for (i = 0; i < 32; i++) {
            int toArray = (int) (Math.random() * 2);
            arr[i] = toArray;
        }
        return arr;
    }
}