package com.company.lesson7.homeWork;

class Person {
    String fullName = "Shaded figure";
    int age;

    void move(String fullName) {
        this.fullName = fullName;
        System.out.println(fullName + " is moving towards you.");
    }

    void talk(String fullName) {
        this.fullName = fullName;
        System.out.println(fullName + " is talking to you");
    }

    public Person() {

    }

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }
}

public class PersonDemo {
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person("Eelon Musk", 46);
        person1.talk(person1.fullName);
        person2.talk(person2.fullName);
        person1.move(person1.fullName);
        person2.move(person2.fullName);
    }
}
