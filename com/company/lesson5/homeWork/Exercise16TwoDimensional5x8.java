package com.company.lesson5.homeWork;

import java.util.Arrays;

public class Exercise16TwoDimensional5x8 {
    public static void main(String[] args) {
        int[][] transferArray = createBasicArray();
        createMinMaxArray(transferArray);
    }

    public static int[][] createBasicArray() {
        int[][] basicArray = new int[5][8];
        int i, j;
        for (i = 0; i < 5; i++) {
            for (j = 0; j < 8; j++) {
                int toArray = (int) (Math.random() * 10);
                basicArray[i][j] = toArray;
            }
        }
        return basicArray;
    }

    public static void createMinMaxArray(int[][] basicArray) {
        int i, j;
        int[][] minMaxArray = new int[5][2];
        for (i = 0; i < 5; i++) {
            int min = basicArray[0][0];
            int max = basicArray[0][0];
            for (j = 0; j < 8; j++) {
                if (basicArray[i][j] > max) {
                    max = basicArray[i][j];
                } else if (basicArray[i][j] < min) {
                    min = basicArray[i][j];
                }
            }
            minMaxArray[i][0] = min;
            minMaxArray[i][1] = max;
        }
        System.out.println(Arrays.deepToString(basicArray));
        System.out.println(Arrays.deepToString(minMaxArray));
    }
}
