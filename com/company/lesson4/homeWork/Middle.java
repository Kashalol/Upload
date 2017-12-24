package com.company.lesson4.homeWork;

public class Middle {
    public static void main(String[] args) {
        int count = 0;
        double d2 = 0.0;
        for (String InputDoubles : args) {
            double d1 = Double.parseDouble(InputDoubles);
            d2 = d2 + d1;
            count++;
        }
        double d3 = d2 / count;
        System.out.println(d3);
    }
}
