package com.company.lesson8.classwork;

public class StudentDemo {
    public static void main(String[] args) {
        Student student1 = new Student("Ivan", "Ivanov", "Java", 4.5);
        Aspirant aspirant1 = new Aspirant("Petr", "Petrov", "C++", 5, "c++ in Java");
        System.out.println(student1.getFirstName());
        System.out.println(student1.getAverageMark());
        System.out.println(aspirant1.getWork());
        Student aspirant2 = new Aspirant("0", "0", "0", 0.0, "0");
        System.out.println(aspirant2.getAverageMark());
        Student[] students = {student1, aspirant1, aspirant2};
        for (Student student3 : students) {
            System.out.println(student3.getScholarship());
        }
    }
}