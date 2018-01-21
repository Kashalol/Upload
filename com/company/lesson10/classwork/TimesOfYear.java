package com.company.lesson10.classwork;

public enum TimesOfYear {
    WINTER(-25), SPRING(15), SUMMER(25) {
        public String getDescription() {
            return "Теплое время года";
        }
    }, AUTUMN(10);
    private double temp;

    TimesOfYear(double temp) {
        this.temp = temp;
    }

    public double getTemp() {
        return temp;
    }

    public String getDescription() {
        return "Холодное время года";
    }
}
