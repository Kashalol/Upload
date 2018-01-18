package com.company.lesson9.classwork.shapes;

public class ShapeDemo {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();
        Shape[] shapeArray = {circle, rectangle};
        for (Shape shape : shapeArray) {
            shape.draw();
        }
        System.out.println(circle);
        System.out.println(rectangle);
    }
}
