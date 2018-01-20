package com.company.lesson9.classwork.printsInterface;

class Book implements Printable{
    int weight;

    public Book(int weight) {
        this.weight = weight;
    }

    public Book() {
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public void print() {
        System.out.println("Книга напечатана");
    }
}
