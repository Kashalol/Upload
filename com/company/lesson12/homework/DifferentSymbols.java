package com.company.lesson12.homework;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DifferentSymbols {
    public static void main(String[] args) {
        String string = "ab2c13 abcd1234 acfsc123 aBBBBBBB12 abcd1234";
        Pattern pattern = Pattern.compile("\\w+");
        Matcher matcher = pattern.matcher(string);
        String[] finalArray = gettingArrayOfStrings(matcher, string);
        findingSmallestAmountOfChars(finalArray, string);
    }

    public static String[] gettingArrayOfStrings(Matcher matcher, String string) {
        int i = 0;
        String[] array = new String[20];
        while (matcher.find()) {
            array[i] = string.substring(matcher.start(), matcher.end());
            i++;
        }
        return fillingFinalArray(i, array);
    }

    private static String[] fillingFinalArray(int finalArrayLength, String[] array) {
        String[] finalArray = new String[finalArrayLength];
        for (int j = 0; j < finalArrayLength; j++) {
            finalArray[j] = array[j];
        }
        return finalArray;
    }

    public static void findingSmallestAmountOfChars(String[] array, String string) {
        int finalAmount = string.length();
        int wordPosition = 0;
        int tmp;
        for (int i = 0; i < array.length; i++) {
            tmp = findingAmountOfUniqueChars(array[i]);
            if (tmp < finalAmount) {
                finalAmount = tmp;
                wordPosition = i;
            }
        }
        System.out.println("Слово содержащее наименьшее количество различных символов это :" + array[wordPosition]);
    }

    public static int findingAmountOfUniqueChars(String string) {
        StringBuilder tmp = new StringBuilder("");
        for (int i = 0; i < string.length(); i++) {
            if (!tmp.toString().contains(String.valueOf(string.charAt(i)))) {
                tmp.append(string.charAt(i));
            }
        }
        return tmp.length();
    }
}