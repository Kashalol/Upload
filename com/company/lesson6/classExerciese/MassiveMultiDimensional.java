package com.company.lesson6.classExerciese;

public class MassiveMultiDimensional {
    public static void main(String[] args) {
        String[][] special = new String[3][6];
        int i, j;
        char c = 'a';
        for (i = 0; i < 3; i++, c++) {
            for (j = 0; j < 6; j++) {
                special[i][j] = c + "" + (j+1);
            }
        }
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 6; j++) {
                System.out.print(special[i][j] + " ");
            }
            System.out.println();
        }
    }
}