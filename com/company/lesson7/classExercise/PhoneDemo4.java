package com.company.lesson7.classExercise;

class Phone4 {
    String number;
    String model;
    String weight;

    public Phone4(String number, String model, String weight) {
        this(number, model);
        this.weight = weight;
    }

    public Phone4(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone4() {
    }

    String info() {
        return (number + " " + model + " " + weight);
    }

    public void sendMesage(String... array){
        for (String receivers : array){
            System.out.println(receivers);
        }
    }
}

public class PhoneDemo4 {
    public static void main(String[] args) {
        Phone4 phone1 = new Phone4("Samsung", "28417", "0,24");
        Phone4 phone2 = new Phone4("sad", "afa");
        Phone4 phone3 = new Phone4();
        System.out.println(phone1.info());
        System.out.println(phone2.info());
        System.out.println(phone3.info());
        phone1.sendMesage("34458","asdjhi","asoidhauigy");
        phone2.sendMesage("Vasiliy");
    }
}