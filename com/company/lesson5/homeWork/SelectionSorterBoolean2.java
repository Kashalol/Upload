package com.company.lesson5.homeWork;

public class SelectionSorterBoolean2 {
    public static void sort(int[] array) {
        boolean arrayChangeBoolean;
        for (int i = 0; i < array.length; i++) {
            int pos = i;
            int min = array[i];
            for (int j = i + 1; j < array.length; j++) {
                if (min > array[j]) {
                    pos = j;
                    min = array[pos];
                }
            }
            array[pos]=array[i];
            array[i] = min;
        }
    }
}
