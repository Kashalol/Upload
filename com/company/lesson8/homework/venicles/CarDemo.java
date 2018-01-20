package com.company.lesson8.homework.venicles;

import com.company.lesson8.homework.details.Engine;
import com.company.lesson8.homework.proffesions.Driver;

public class CarDemo {
    public static void main(String[] args) {
        Engine engine1 = new Engine();
        Driver driver1 = new Driver();
        Car car1 = new Car("Suzuki", "B", 1050, engine1, driver1);
        Lorry lorry = new Lorry("Tata","C",1800,engine1,driver1,800);
        SportCar sportCar = new SportCar("Ferrari","B",768,engine1,driver1,267.4);
        lorry.start();
        lorry.stop();
        lorry.turnLeft();
        lorry.turnRight();
        lorry.fullInfo();
        sportCar.start();
        sportCar.stop();
        sportCar.turnLeft();
        sportCar.turnRight();
        sportCar.fullInfo();
        car1.start();
        car1.stop();
        car1.turnLeft();
        car1.turnRight();
        car1.fullInfo();
    }
}