package com.company.lesson8.homework.proffesions;

public class Driver extends Person{
    int drivingExperience;

    public Driver(){

    }
    public Driver(String fullName){
        super(fullName);
        this.drivingExperience = drivingExperience;
    }

    public int getDrivingExperience() {
        return drivingExperience;
    }

    public void setDrivingExperience(int drivingExperience) {
        this.drivingExperience = drivingExperience;
    }
}
