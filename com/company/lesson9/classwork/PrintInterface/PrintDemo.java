package com.company.lesson9.classwork.PrintInterface;

public class PrintDemo {
    public static void main(String[] args) {
        Book book1 = new Book();
        Book book2 = new Book();
        Magazine magazine1 = new Magazine();
        Magazine magazine2 = new Magazine();
        Printable[] toPrint = {book1, book2, magazine1, magazine2};
        for (Printable printable : toPrint) {
            printable.print();
        }
    }
}
