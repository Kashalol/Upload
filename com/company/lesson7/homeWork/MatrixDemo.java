package com.company.lesson7.homeWork;


import java.util.Arrays;

class Matrix {
    double[][] array;
    int lines = 3;
    int columns = 3;

    public double[][] fillingMatrix(double[][] randomDoubleArray) {
        randomDoubleArray = new double[lines][columns];
        for (int linesCounter = 0; linesCounter < lines; linesCounter++) {
            for (int columnCounter = 0; columnCounter < columns; columnCounter++) {
                randomDoubleArray[linesCounter][columnCounter] = (Math.random() * 10);
            }
        }
        return randomDoubleArray;
    }

    public double[][] addingTwoArrays(double[][] matrixBasic, double[][] matrixOperator) {
        double[][] resultArray = new double[lines][columns];
        for (int linesCounter = 0; linesCounter < lines; linesCounter++) {
            for (int columnCounter = 0; columnCounter < columns; columnCounter++) {
                resultArray[linesCounter][columnCounter] = matrixBasic[linesCounter][columnCounter] + matrixOperator[linesCounter][columnCounter];
            }
        }
        System.out.println("Результат сложения матрицы :");
        System.out.println(Arrays.deepToString(matrixBasic));
        System.out.println("И матрицы :");
        System.out.println(Arrays.deepToString(matrixOperator));
        System.out.println("Будет следующим");
        System.out.println(Arrays.deepToString(resultArray));
        return resultArray;
    }

    public double[][] multiplyOnRandomNumber(double[][] matrixBasic) {
        int multiplier = (int) (Math.random() * 10);
        double[][] resultMatrix = new double[lines][columns];
        for (int linesCounter = 0; linesCounter < lines; linesCounter++) {
            for (int columnCounter = 0; columnCounter < columns; columnCounter++) {
                resultMatrix[linesCounter][columnCounter] = matrixBasic[linesCounter][columnCounter] * multiplier;
            }
        }
        System.out.println("Результатом умножения матрицы :");
        System.out.println(Arrays.deepToString(matrixBasic));
        System.out.println("И числа " + multiplier);
        System.out.println("Будет следующим :");
        System.out.println(Arrays.deepToString(resultMatrix));
        return resultMatrix;
    }

    public double[][] multiplyingMatrixes(double[][] matrixBasic, double[][] matrixOperator) {
        double[][] resultArray = new double[lines][columns];
        for (int linesCounter = 0; linesCounter < lines; linesCounter++) {
            for (int columnCounter = 0; columnCounter < columns; columnCounter++) {
                resultArray[linesCounter][columnCounter] = matrixBasic[linesCounter][columnCounter] * matrixOperator[linesCounter][columnCounter];
            }
        }
        System.out.println("Результат умножения матрицы :");
        System.out.println(Arrays.deepToString(matrixBasic));
        System.out.println("На матрицу :");
        System.out.println(Arrays.deepToString(matrixOperator));
        System.out.println("Будет следующим");
        System.out.println(Arrays.deepToString(resultArray));
        return resultArray;
    }
}

public class MatrixDemo {
    public static void main(String[] args) {
        Matrix matrix1 = new Matrix();
        Matrix matrix2 = new Matrix();
        matrix1.fillingMatrix(matrix1.array);
        matrix2.fillingMatrix(matrix2.array);
        matrix1.addingTwoArrays(matrix1.fillingMatrix(matrix1.array), matrix2.fillingMatrix(matrix2.array));
        matrix1.multiplyOnRandomNumber(matrix1.fillingMatrix(matrix1.array));
        System.out.println(Arrays.deepToString(matrix1.fillingMatrix(matrix1.array)));
        matrix1.multiplyingMatrixes(matrix1.fillingMatrix(matrix1.array), matrix2.fillingMatrix(matrix2.array));
    }
}
