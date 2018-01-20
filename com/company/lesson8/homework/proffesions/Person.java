package com.company.lesson8.homework.proffesions;

public class Person {
    private String fullName;

    public Person() {
    }

    public Person(String fullInfo) {
        this.fullName = fullInfo;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
}