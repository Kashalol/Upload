package com.company.lesson3.homeWork;

public class ConvertTable {
    public static void main(String[] args) {
        String[] types = {"   byte", "   short", "   char", "    int", "   long", "   float", "  double", " boolean"};
        String[] spaces = {"         |", "    НЯ   |", "    Я    |", "    Т    |", "    X    |"};
        makingFullTypeName(types);
        printFirstLine(types, spaces);
        printSecondLine(types, spaces);
        printThirdLine(types, spaces);
        printFourthLine(types, spaces);
        printFifthLine(types, spaces);
        printSixthLine(types, spaces);
        printSeventhLine(types, spaces);
        printEighthLine(types, spaces);
        printNinthLine(types, spaces);
    }

    private static void makingFullTypeName(String[] types) {
        for (int i = 0; i < types.length; i++) {
            types[i] = heading(types[i]);
        }
    }

    public static void printFirstLine(String[] types, String[] spaces) {
        System.out.print(spaces[0]);
        for (String socket : types) {
            System.out.print(socket);
        }
    }

    public static void printSecondLine(String[] types, String[] spaces) {
        System.out.println(" ");
        System.out.print(types[0]);
        System.out.print(spaces[3]);
        System.out.print(spaces[1]);
        System.out.print(spaces[2]);
        System.out.print(spaces[1]);
        System.out.print(spaces[1]);
        System.out.print(spaces[1]);
        System.out.print(spaces[1]);
        System.out.print(spaces[4]);
    }

    public static void printThirdLine(String[] types, String[] spaces) {
        System.out.println(" ");
        System.out.print(types[1]);
        System.out.print(spaces[2]);
        System.out.print(spaces[3]);
        System.out.print(spaces[2]);
        System.out.print(spaces[1]);
        System.out.print(spaces[1]);
        System.out.print(spaces[1]);
        System.out.print(spaces[1]);
        System.out.print(spaces[4]);
    }

    public static void printFourthLine(String[] types, String[] spaces) {
        System.out.println(" ");
        System.out.print(types[2]);
        System.out.print(spaces[2]);
        System.out.print(spaces[2]);
        System.out.print(spaces[3]);
        System.out.print(spaces[2]);
        System.out.print(spaces[2]);
        System.out.print(spaces[2]);
        System.out.print(spaces[2]);
        System.out.print(spaces[4]);
    }

    public static void printFifthLine(String[] types, String[] spaces) {
        System.out.println(" ");
        System.out.print(types[3]);
        System.out.print(spaces[2]);
        System.out.print(spaces[2]);
        System.out.print(spaces[1]);
        System.out.print(spaces[3]);
        System.out.print(spaces[1]);
        System.out.print(spaces[1]);
        System.out.print(spaces[1]);
        System.out.print(spaces[4]);
    }

    public static void printSixthLine(String[] types, String[] spaces) {
        System.out.println(" ");
        System.out.print(types[4]);
        System.out.print(spaces[2]);
        System.out.print(spaces[2]);
        System.out.print(spaces[1]);
        System.out.print(spaces[2]);
        System.out.print(spaces[3]);
        System.out.print(spaces[1]);
        System.out.print(spaces[1]);
        System.out.print(spaces[4]);
    }

    public static void printSeventhLine(String[] types, String[] spaces) {
        System.out.println(" ");
        System.out.print(types[5]);
        System.out.print(spaces[2]);
        System.out.print(spaces[2]);
        System.out.print(spaces[1]);
        System.out.print(spaces[2]);
        System.out.print(spaces[2]);
        System.out.print(spaces[3]);
        System.out.print(spaces[1]);
        System.out.print(spaces[4]);
    }

    public static void printEighthLine(String[] types, String[] spaces) {
        System.out.println(" ");
        System.out.print(types[6]);
        System.out.print(spaces[2]);
        System.out.print(spaces[2]);
        System.out.print(spaces[3]);
        System.out.print(spaces[2]);
        System.out.print(spaces[2]);
        System.out.print(spaces[2]);
        System.out.print(spaces[3]);
        System.out.print(spaces[4]);
    }

    public static void printNinthLine(String[] types, String[] spaces) {
        System.out.println(" ");
        System.out.print(types[7]);
        System.out.print(spaces[4]);
        System.out.print(spaces[4]);
        System.out.print(spaces[4]);
        System.out.print(spaces[4]);
        System.out.print(spaces[4]);
        System.out.print(spaces[4]);
        System.out.print(spaces[4]);
        System.out.print(spaces[3]);
    }

    public static String heading(String type) {
        for (int i = 10; type.length() < i; i--) {
            type = type + " ";
        }
        return type + "|";
    }
}
