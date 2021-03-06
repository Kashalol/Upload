package com.company.lesson6.classExerciese;

class Phone {
    String number;
    String model;
    String weight;

    String info() {
        return (number + " " + model + " " + weight);
    }
}

public class PhoneDemo1 {
    public static void main(String[] args) {
        Phone phone1 = new Phone();
        Phone phone2 = new Phone();
        Phone phone3 = new Phone();
        phone1.model = "Apple";
        phone1.number = "46579";
        phone1.weight = "64.2";

        phone2.model = "Samsung";
        phone2.number = "56497";
        phone2.weight = "81.2";

        phone3.model = "Lenovo";
        phone3.number = "214";
        phone3.weight = "62.2";
        System.out.println(phone1.info());
        System.out.println(phone2.info());
        System.out.println(phone3.info());
    }
}