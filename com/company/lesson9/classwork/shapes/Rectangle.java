package com.company.lesson9.classwork.shapes;

import java.util.Objects;

public class Rectangle extends Shape {
    private double coor;

    public Rectangle(String color, double coor) {
        super(color);
        this.coor = coor;
    }

    public Rectangle() {
    }

    public double getCoor() {
        return coor;
    }

    public void setCoor(double coor) {
        this.coor = coor;
    }

    @Override
    public void draw() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Rectangle rectangle = (Rectangle) o;
        return Double.compare(rectangle.coor, coor) == 0;
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), coor);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "coor=" + coor +
                '}';
    }
}
