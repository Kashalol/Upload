package com.company.lesson12.homework;

public class OOPchanging {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("I think that object oriented programming is a nice philosophy.");
        String sample = "object oriented programming";
        int counter = s.toString().length() / sample.length();
        changingStringElementSample(s, sample, counter);
        System.out.println(s);
    }

    private static void changingStringElementSample(StringBuilder s, String sample, int counter) {
        for (int i = 0; i < counter; i++) {
            int start = s.indexOf(sample);
            if (s.toString().contains(sample)) {
                s.replace(start, start + sample.length(), "OOP");
            }
        }
    }
}
