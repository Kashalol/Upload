package com.company.lesson7.homeWork;

import java.util.Arrays;

class Phone {
    int number;
    String model = "Empty";
    double weight;

    public Phone(int number, String model, double weight) {
        this(number, model);
        this.weight = weight;
    }

    public Phone(int number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone() {
    }

    String info() {
        return (number + " " + model + " " + weight);
    }

    public void receiveCall(String callerName) {
        System.out.println(callerName + " is calling");
    }

    public int getNumber(int number) {
        return number;
    }

    public void receiveCall(String callername, int number) {
        System.out.println(callername + " " + "is calling. His number is " + number);
    }

    public void sendMessage(int... numbers) {
        System.out.println("Next numbers will receive message : " + Arrays.toString(numbers));
    }
}

public class PhoneDemoHomeWork {
    public static void main(String[] args) {
        Phone phone1 = new Phone(3720001, "Samsung", 0.24);
        Phone phone2 = new Phone(3720002, "Lenovo");
        Phone phone3 = new Phone();
        System.out.println(phone1.number + phone1.model + phone1.weight);
        System.out.println(phone2.number + phone2.model + phone2.weight);
        System.out.println(phone3.number + phone3.model + phone3.weight);
        System.out.println(phone1.info());
        System.out.println(phone2.info());
        System.out.println(phone3.info());
        phone1.receiveCall("Batman");
        phone2.receiveCall("Superman");
        phone3.receiveCall("Kevin Mitnik");
        phone1.getNumber(phone1.number);
        phone2.getNumber(phone2.number);
        phone3.getNumber(phone3.number);
        phone1.receiveCall("Batman", phone1.number);
        phone1.receiveCall("Superman", phone2.number);
        phone1.receiveCall("Kevin Mitnik", phone3.number);
        phone1.sendMessage(phone1.number, phone2.number, phone3.number);
    }
}