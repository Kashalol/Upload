package com.company.lesson7.homeWork;

public class RecursionOutput {
    public static void main(String[] args) {
        int firstNumber, secondNumber;
        firstNumber = creatingRandomNumber();
        secondNumber = creatingRandomNumber();
        comparingNumbers(firstNumber, secondNumber);
    }

    public static int creatingRandomNumber() {
        int created = (int) (Math.random() * 50);
        return created;
    }

    public static void comparingNumbers(int first, int second) {
        if (first < second) {
            lesserFirst(first, second);
        } else {
            lesserSecond(first, second);
        }
    }

    public static int lesserFirst(int first, int second) {
        int outputing;
        if (first == second) {
            return second;
        }
        outputing = lesserFirst((first + 1), second);
        System.out.println(first);
        return outputing;
    }

    public static int lesserSecond(int first, int second) {
        int outputing;
        if (first == second) {
            return second;
        }
        outputing = lesserSecond((first - 1), second);
        System.out.println(first);
        return outputing;
    }
}
