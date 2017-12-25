package com.company.lesson5.classExercise;

public class DayOfWeek {
    public static void main(String[] args) {
        String str = args.length > 0 ? args[0] : "7";
        int i1 = Integer.parseInt(str);
        String day;
        switch (i1) {
            case 1:
                day = "Понедельник";
                break;
            case 2:
                day = "Вторник";
                break;
            case 3:
                day = "Среда";
                break;
            case 4:
                day = "Четверг";
                break;
            case 5:
                day = "пятница";
                break;
            case 6:
            case 7:
                day = "Выходной";
                break;
            default:
                day = "Облом";
        }
        System.out.println(day);
    }
}
