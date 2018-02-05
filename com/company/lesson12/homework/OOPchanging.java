package com.company.lesson12.homework;

public class OOPchanging {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("I think that object oriented programming is a nice philosophy.");
        String sample = "object oriented programming";
        int counter = s.toString().length() / sample.length();
        usingStringReplace(s.toString(), sample);
        System.out.println((changingStringElementSample(s, sample, counter)).toString());
    }

    private static StringBuilder changingStringElementSample(StringBuilder s, String sample, int counter) {
        for (int i = 0; i < counter; i++) {
            int start = s.indexOf(sample);
            if (s.toString().contains(sample)) {
                s.replace(start, start + sample.length(), "OOP");
            }
        }
        return s;
    }

    private static void usingStringReplace(String s, String sample) {
        System.out.println(s);
        System.out.println(s.replace(sample,"OOP"));
    }
}
