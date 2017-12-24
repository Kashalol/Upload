package com.company.lesson5.classExercise;

public class DayOfWeek2 {
    public static void main(String[] args) {
        String str = args.length > 0 ? args[0] : "7";
        if ("1".equals(str)) {
            System.out.println("Понедельник");
        } else if ("2".equals(str)) {
            System.out.println("Вторник");
        } else if ("3".equals(str)) {
            System.out.println("Среда");
        } else if ("4".equals(str)) {
            System.out.println("Четверг");
        } else if ("5".equals(str)) {
            System.out.println("Пятница");
        } else if ("6".equals(str) || "7".equals(str)) {
            System.out.println("ВЫХОДНОЙ!!!!!");
        } else {
            System.out.println("Ошибка ввода");
        }
    }
}
