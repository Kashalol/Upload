package com.company.lesson9.classwork.printsInterface;

public class PrintDemo {
    public static void main(String[] args) {
        Book book1 = new Book(12);
        Book book2 = new Book(13);
        Magazine magazine1 = new Magazine(54);
        Magazine magazine2 = new Magazine(49);
        Printable[] toPrint = {book1, book2, magazine1, magazine2};
        for (Printable printable : toPrint) {
            printable.print();
        }
        Magazine.printMagazines(toPrint);
        Book.printBooks(toPrint);
    }
}
