package com.company.lesson6.homeWork;

class Phone {
    int number;
    String model;
    String weight;

    String info() {
        return (number + " " + model + " " + weight);
    }

    void receiveCall() {
        String caller = "Бэтмен";
        System.out.println("Звонит " + caller);
    }

    public int getNumber(int phoneNumber) {
        return phoneNumber;
    }
}

public class Phone1 {
    public static void main(String[] args) {
        Phone phone1 = new Phone();
        Phone phone2 = new Phone();
        Phone phone3 = new Phone();
        phone1.model = "Samsung X360i";
        phone1.number = 3720001;
        phone1.weight = "64.2";

        phone2.model = "Samsung X470";
        phone2.number = 3720002;
        phone2.weight = "81.2";

        phone3.model = "Lenovo K720";
        phone3.number = 3720003;
        phone3.weight = "62.2";
        System.out.println(phone1.info());
        System.out.println(phone2.info());
        System.out.println(phone3.info());
        phone1.receiveCall();
        phone2.receiveCall();
        phone3.receiveCall();
        System.out.println(phone1.getNumber(phone1.number));
        System.out.println(phone2.getNumber(phone2.number));
        System.out.println(phone3.getNumber(phone3.number));
    }
}