package com.company.lesson7.classExercise;

import java.util.Arrays;

public class ThreeDimensionMassive {
    public static void main(String[] args) {
        String[][][] str = new String[3][5][6];
        float[][] flo = {
                {93.4f, 34.2f, 21.24f},
                {12.23f, 8.2f, 23.213f}
        };
        System.out.println(Arrays.deepToString(flo));
        inputed(new int[][]{{}});
    }

    public static void inputed(int[][] array2) {
        System.out.println(Arrays.toString(array2));
    }
}
