package com.company.lesson7.homeWork;

import java.util.Arrays;

class Phone {
    private int number;
    private String model = "Empty";
    private double weight;
    static int count = 0;

    public Phone(int number, String model, double weight) {
        this(number, model);
        this.weight = weight;
    }

    public Phone(int number, String model) {
        this.number = number;
        this.model = model;
        count++;
    }

    public Phone() {
        count++;
    }

    String info() {
        return (number + " " + model + " " + weight);
    }

    public void receiveCall(String callerName) {
        System.out.println(callerName + " is calling");
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setModel(String model) {

        this.model = model;
    }

    public int getNumber() {
        return number;
    }

    public String getModel() {
        return model;
    }

    public double getWeight() {
        return weight;
    }

    public static int getCount() {
        return count;
    }

    public void receiveCall(String callername, int number) {
        System.out.println(callername + " " + "is calling. His number is " + number);
    }

    public void sendMessage(int... numbers) {
        System.out.println("Next numbers will receive message : " + Arrays.toString(numbers));
    }

    protected void finalize() {
        System.out.println("FINALIZE!!!");
        count--;
        System.out.println(count + " phones has left");
    }
}

public class PhoneDemoHomeWork {
    public static void main(String[] args) {
        Phone phone1 = new Phone(3720001, "Samsung", 0.24);
        Phone phone2 = new Phone(3720002, "Lenovo");
        Phone phone3 = new Phone();
        System.out.println(phone1.getNumber());
        System.out.println(phone2.getNumber() + phone2.getModel() + phone2.getWeight());
        System.out.println(phone3.getNumber() + phone3.getModel() + phone3.getWeight());
        System.out.println(phone1.info());
        System.out.println(phone2.info());
        System.out.println(phone3.info());
        phone1.receiveCall("Batman");
        phone2.receiveCall("Superman");
        phone3.receiveCall("Kevin Mitnik");
        phone1.getNumber();
        phone2.getNumber();
        phone3.getNumber();
        phone1.receiveCall("Batman", phone1.getNumber());
        phone1.receiveCall("Superman", phone2.getNumber());
        phone1.receiveCall("Kevin Mitnik", phone3.getNumber());
        phone1.sendMessage(phone1.getNumber(), phone2.getNumber(), phone3.getNumber());
        System.out.println(Phone.count + " phones was created");
        phone1 = phone2;
        System.gc();
    }
}