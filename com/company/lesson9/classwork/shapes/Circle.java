package com.company.lesson9.classwork.shapes;

import java.util.Objects;

public class Circle extends Shape {
    private double coordinate;

    public Circle(String color, double coordinate) {
        super(color);
        this.coordinate = coordinate;
    }

    public Circle() {
    }

    public double getCoordinate() {
        return coordinate;
    }

    public void setCoordinate(double coordinate) {
        this.coordinate = coordinate;
    }

    @Override
    public void draw() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Circle circle = (Circle) o;
        return Double.compare(circle.coordinate, coordinate) == 0;
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), coordinate);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "coordinate=" + coordinate +
                "} " + super.toString();
    }
}
