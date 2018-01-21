package com.company.lesson10.classwork;

public class TimesOfYearDemo {
    public static void main(String[] args) {
        TimesOfYear bestSeason = TimesOfYear.SPRING;
        System.out.println(bestSeason);
        chooseSeason(bestSeason);
        printAllValues();
        compareValue(bestSeason);
    }

    public static void chooseSeason(TimesOfYear bestSeason) {
        switch (bestSeason) {
            case WINTER:
                System.out.println("Мое любимое время года зима, температура в среднем " + bestSeason.getTemp());
                break;
            case SUMMER:
                System.out.println("Мое любимое время года лето, температура в среднем " + bestSeason.getTemp());
                break;
            case AUTUMN:
                System.out.println("Мое любимое время года осень, температура в среднем " + bestSeason.getTemp());
                break;
            case SPRING:
                System.out.println("Мое любимое время года весна, температура в среднем " + bestSeason.getTemp());
                break;
            default:
                System.out.println("Ненавижу погоду!");
        }
    }

    public static void printAllValues() {
        TimesOfYear[] season = TimesOfYear.values();
        for (TimesOfYear time : season) {
            System.out.print(time + " " + time.ordinal() + " " + time.getTemp() + " ");
            System.out.println(time.getDescription());
        }
    }

    public static void compareValue(TimesOfYear bestSeason) {
        bestSeason = TimesOfYear.valueOf("SPRING");
        System.out.println(bestSeason);
    }
}
