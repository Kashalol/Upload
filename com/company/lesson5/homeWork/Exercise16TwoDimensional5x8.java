package com.company.lesson5.homeWork;

import java.util.Arrays;

public class Exercise16TwoDimensional5x8 {
    public static void main(String[] args) {
        createBasicArray();
        int[][] arr2 = createBasicArray();
        createMinMaxArray(arr2);
    }

    public static int[][] createBasicArray() {
        int[][] arr = new int[5][8];
        int i, j= 0;
        for (i = 0; i < 5; i++) {
            for (j = 0; j < 8; j++) {
                int toArray = (int) (Math.random() * 10);
                arr[i][j] = toArray;
            }
        }
        return arr;
    }

    public static int[][] createMinMaxArray(int[][] arr2) {
        int i, j;
        int[][] arr3 = new int[5][2];
        for (i = 0; i < 5; i++) {
            int min = 100;
            int max = 0;
            for (j = 0; j < 8; j++) {
                if (arr2[i][j] > max) {
                    max = arr2[i][j];
                } else if (arr2[i][j] < min) {
                    min = arr2[i][j];
                }
            }
            arr3[i][0] = min;
            arr3[i][1] = max;
        }
        System.out.println(Arrays.deepToString(arr2));
        System.out.println(Arrays.deepToString(arr3));
        return arr2;
    }
}
