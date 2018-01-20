package com.company.lesson8.homework.vetDoc;

public class VetDemo {
    public static void main(String[] args) {
        VetDoctor vet = new VetDoctor();
        Dog dog1 = new Dog();
        dog1.setLocation("будке");
        Cat cat1 = new Cat();
        cat1.setLocation("квартире");
        Horse horse1 = new Horse();
        horse1.setLocation("конюшне");
        Animal[] patients = {dog1, cat1, horse1};
        for (Animal animal:patients) {
            vet.treatAnimal(animal);
        }
    }
}
