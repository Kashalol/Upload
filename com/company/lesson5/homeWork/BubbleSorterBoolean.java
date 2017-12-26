package com.company.lesson5.homeWork;

public class BubbleSorterBoolean {
    public static void sort(int[] array) {
        boolean arrayChangeBoolean;
        // i - номер прохода
        for (int i = 0; i < array.length; i++) {
            arrayChangeBoolean = false;
            // внутренний цикл прохода
            for (int j = array.length - 1; j > i; j--) {
                if (array[j - 1] > array[j]) {
                    int tmp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = tmp;
                    arrayChangeBoolean = true;
                }
                if (j == i + 1 && !arrayChangeBoolean) {
                    return;
                }
            }
        }
    }
}