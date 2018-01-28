package com.company.lesson7.homeWork;

class Person {
    String fullName = "Shaded figure";
    int age;

    public Person() {
    }

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    void move() {
        System.out.println(fullName + " is moving towards you.");
    }

    void talk() {
        System.out.println(fullName + " is talking to you");
    }

}

public class PersonDemo {
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person("Eelon Musk", 46);
        person1.talk();
        person2.talk();
        person1.move();
        person2.move();
    }
}
