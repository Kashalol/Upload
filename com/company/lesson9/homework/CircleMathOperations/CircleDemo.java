package com.company.lesson9.homework.CircleMathOperations;

import java.util.Objects;

class Circle {
    private double radius;
    public static final double PI = 3.14159265358979323846;

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle() {
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public static double getPI() {
        return PI;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return Double.compare(circle.radius, radius) == 0;
    }

    @Override
    public int hashCode() {

        return Objects.hash(radius);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }

    public void areaCircle(double radius) {
        double result = PI * radius * radius;
        System.out.println("Площадь окружности с радиусом " + radius + " равна " + result);
    }

    public void lengthCircle(double radius) {
        double result = 2 * PI * radius;
        System.out.println("Длинна окружности с радиусом "+radius+" равна "+result);
    }
}

public class CircleDemo{
    public static void main(String[] args) {
        Circle circle1 = new Circle(23.2);
        Circle circle2 = new Circle(4.035);
        Circle circle3 = new Circle(89.16);
        circle1.areaCircle(circle1.getRadius());
        circle1.lengthCircle(circle1.getRadius());
        circle2.areaCircle(circle2.getRadius());
        circle2.lengthCircle(circle2.getRadius());
        circle3.areaCircle(circle3.getRadius());
        circle3.lengthCircle(circle3.getRadius());
    }
}
