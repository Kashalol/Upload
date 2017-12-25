package com.company.lesson4.homeWork;

public class Middle {
    public static void main(String[] args) {
        int count = 0;
        double d2 = 0.0;
        for (String inputDoubles : args) {
            double d1 = Double.parseDouble(inputDoubles);
            d2 = d2 + d1;
            count++;
        }
        double d3 = d2 / count;
        System.out.println(d3);
    }
}
