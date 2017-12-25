package com.company.lesson5.homeWork;

public class BubbleSorterInverted {
    public static void sort(int[] array) {
        first:
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length; j++) {
                for (int k = 1; k < array.length && array[k] < array[k - 1]; k++) {
                    if (k == array.length - 1) {
                        break first;
                    }
                }
                if (array[j] > array[j - 1]) {
                    int tmp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = tmp;
                }
            }
        }
    }
}
