package com.company.lesson7.homeWork;


import java.util.Arrays;

class Matrix {
    static final private int LINES = 3;
    static final private int COLUMNS = 3;
    double[][] array;

    public Matrix() {
    }

    public double[][] getArray() {
        return array;
    }

    public void setArray(double[][] array) {
        this.array = array;
    }

    public double[][] fillingMatrix() {
        double[][] randomDoubleArray = new double[LINES][COLUMNS];
        for (int linesCounter = 0; linesCounter < LINES; linesCounter++) {
            for (int columnCounter = 0; columnCounter < COLUMNS; columnCounter++) {
                randomDoubleArray[linesCounter][columnCounter] = (int) (Math.random() * 10);
            }
        }
        return randomDoubleArray;
    }

    public void addingTwoArrays(Matrix matrix) {
        double[][] matrixBasic = this.array;
        double[][] matrixOperator = matrix.getArray();
        double[][] resultArray = new double[LINES][COLUMNS];
        for (int linesCounter = 0; linesCounter < LINES; linesCounter++) {
            for (int columnCounter = 0; columnCounter < COLUMNS; columnCounter++) {
                resultArray[linesCounter][columnCounter] = matrixBasic[linesCounter][columnCounter] +
                        matrixOperator[linesCounter][columnCounter];
            }
        }
        printingOperationResult(matrixBasic, matrixOperator, resultArray, "Результат сложения матрицы :", "И матрицы :");
    }

    private void printingOperationResult(double[][] matrixBasic, double[][] matrixOperator, double[][] resultArray, String s, String s2) {
        System.out.println(s);
        System.out.println(Arrays.deepToString(matrixBasic));
        System.out.println(s2);
        System.out.println(Arrays.deepToString(matrixOperator));
        System.out.println("Будет следующим");
        System.out.println(Arrays.deepToString(resultArray));
    }

    public void multiplyOnRandomNumber() {
        double[][] matrixBasic = this.array;
        int multiplier = (int) (Math.random() * 10);
        double[][] resultMatrix = new double[LINES][COLUMNS];
        for (int linesCounter = 0; linesCounter < LINES; linesCounter++) {
            for (int columnCounter = 0; columnCounter < COLUMNS; columnCounter++) {
                resultMatrix[linesCounter][columnCounter] = matrixBasic[linesCounter][columnCounter] * multiplier;
            }
        }
        printingMultiplyOnNumberResult("Результатом умножения матрицы :", Arrays.deepToString(matrixBasic),
                "И числа " + multiplier, "Будет следующим :", Arrays.deepToString(resultMatrix));
    }

    private void printingMultiplyOnNumberResult(String s, String s2, String s3, String s4, String s5) {
        System.out.println(s);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s5);
    }

    public void multiplyingMatrixes(Matrix matrix) {
        double[][] matrixBasic = this.array;
        double[][] matrixOperator = matrix.getArray();
        double[][] resultArray = new double[LINES][COLUMNS];
        for (int linesCounter = 0; linesCounter < LINES; linesCounter++) {
            for (int columnCounter = 0; columnCounter < COLUMNS; columnCounter++) {
                for (int i = 0; i < 3; i++) {
                    resultArray[linesCounter][columnCounter] += matrixBasic[linesCounter][i] *
                            matrixOperator[i][columnCounter];
                }
            }
        }
        printingOperationResult(matrixBasic, matrixOperator, resultArray,
                "Результат умножения матрицы :", "На матрицу :");
    }

    @Override
    public String toString() {
        return "Matrix{" +
                "array =" + Arrays.deepToString(array) +
                '}';
    }
}

public class MatrixDemo {
    public static void main(String[] args) {
        Matrix matrix1 = new Matrix();
        Matrix matrix2 = new Matrix();
        matrix1.setArray(matrix1.fillingMatrix());
        matrix2.setArray(matrix2.fillingMatrix());
        matrix1.addingTwoArrays(matrix2);
        matrix1.multiplyOnRandomNumber();
        matrix2.multiplyOnRandomNumber();
        System.out.println(matrix1);
        System.out.println(matrix2);
        matrix1.multiplyingMatrixes(matrix2);
    }
}
