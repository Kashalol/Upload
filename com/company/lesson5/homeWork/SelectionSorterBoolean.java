package com.company.lesson5.homeWork;

public class SelectionSorterBoolean {
    public static void sort(int[] array) {
        boolean arrayChangeBoolean;
        for (int i = 0; i < array.length; i++) {    // i - номер текущего шага
            arrayChangeBoolean = false;
            int pos = i;
            int min = array[i];
            // цикл выбора наименьшего элемента
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    pos = j;    // pos - индекс наименьшего элемента
                    min = array[j];
                    arrayChangeBoolean = true;

                }
                if (j == array.length -1 && !arrayChangeBoolean) {
                    break;
                }
            }
            array[pos] = array[i];
            array[i] = min;    // меняем местами наименьший с array[i]
        }
    }
}
