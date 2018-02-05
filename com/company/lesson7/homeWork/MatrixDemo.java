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

    public double[][] addingTwoArrays(Matrix matrix) {
        double[][] matrixBasic = this.array;
        double[][] matrixOperator = matrix.getArray();
        double[][] resultArray = new double[LINES][COLUMNS];
        for (int linesCounter = 0; linesCounter < LINES; linesCounter++) {
            for (int columnCounter = 0; columnCounter < COLUMNS; columnCounter++) {
                resultArray[linesCounter][columnCounter] = matrixBasic[linesCounter][columnCounter] +
                        matrixOperator[linesCounter][columnCounter];
            }
        }
        return resultArray;
    }

    public double[][] multiplyOnRandomNumber(int multiplier) {
        double[][] matrixBasic = this.array;
        double[][] resultArray = new double[LINES][COLUMNS];
        for (int linesCounter = 0; linesCounter < LINES; linesCounter++) {
            for (int columnCounter = 0; columnCounter < COLUMNS; columnCounter++) {
                resultArray[linesCounter][columnCounter] = matrixBasic[linesCounter][columnCounter] * multiplier;
            }
        }
        return resultArray;
    }


    public double[][] multiplyingMatrixes(Matrix matrix) {
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
        return resultArray;
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
        int randomNumberMultiplier = (int) (Math.random() * 10);
        matrix1.multiplyOnRandomNumber(randomNumberMultiplier);
        matrix2.multiplyOnRandomNumber(randomNumberMultiplier);
        System.out.println(matrix1);
        System.out.println(matrix2);
        matrix1.multiplyingMatrixes(matrix2);
        printingResultMatrixAndIntegerOperation(matrix1, randomNumberMultiplier, " умножения ");
        printingResultMatrixAndIntegerOperation(matrix2, randomNumberMultiplier, " умножения ");
        printingResultTwoMatrixOperation(matrix1.getArray(), matrix2.getArray(), " сложения ",
                matrix1.addingTwoArrays(matrix2));
        printingResultTwoMatrixOperation(matrix1.getArray(), matrix2.getArray(), " умножения ",
                matrix1.multiplyingMatrixes(matrix2));
    }

    public static void printingResultMatrixAndIntegerOperation(Matrix matrix1, int randomNumberMultiplier,
                                                               String operation) {
        System.out.println("Результат" + operation + " матрицы " + Arrays.deepToString(matrix1.getArray()) + " и числа "
                + randomNumberMultiplier + " равен " +
                Arrays.deepToString(matrix1.multiplyOnRandomNumber(randomNumberMultiplier)));
    }

    public static void printingResultTwoMatrixOperation(double[][] matrixBasic, double[][] matrixOperator,
                                      String operation, double[][] matrixResult) {
        System.out.println("Результатом" + operation + " матрицы " + Arrays.deepToString(matrixBasic) + " и матрицы " +
                Arrays.deepToString(matrixOperator));
        System.out.println("Будет матрица :");
        System.out.println(Arrays.deepToString(matrixResult));
    }
}
