package com.company.lesson4.homeWork;

public class OddArgument {
    public static void main(String[] args) {
        int i1 = Integer.parseInt(args[0]);
        if (i1 % 2 == 0) {
            System.out.println("Ошибка ввода аргумента");
        } else {
            System.out.println(i1);
        }
    }
}