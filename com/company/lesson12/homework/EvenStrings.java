package com.company.lesson12.homework;

public class EvenStrings {
    public static void main(String[] args) {
        String string = "String";
        String code = "Code";
        String practice = "Practice";
        printingResult(string);
        printingResult(code);
        printingResult(practice);
    }

    private static void printingResult(String string) {
        System.out.println("Для " + string + " две средние буквы: " + middleChars(string));
    }

    public static StringBuilder middleChars(String string) {
        StringBuilder result = new StringBuilder();
        char a = string.charAt((string.length() / 2) - 1);
        char b = string.charAt(string.length() / 2);
        return result.append(a).append(b);
    }
}
