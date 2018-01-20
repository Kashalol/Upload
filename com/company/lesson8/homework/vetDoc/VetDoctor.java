package com.company.lesson8.homework.vetDoc;

public class VetDoctor {
    private int age;

    public VetDoctor() {
    }

    public VetDoctor(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    void treatAnimal(Animal animal) {
        System.out.print("Пациент употребляет в пищу ");
        animal.eat();
        System.out.println("Пациент проживает в " + animal.getLocation());
    }
}
