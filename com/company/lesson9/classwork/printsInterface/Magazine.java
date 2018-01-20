package com.company.lesson9.classwork.printsInterface;

class Magazine implements Printable{
    int price;

    public Magazine(int price) {
        this.price = price;
    }

    public Magazine() {
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public void print() {
        System.out.println("Журнал напечатан");
    }
}
