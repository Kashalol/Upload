package com.company.lesson10.homework.instruments;

import java.util.Objects;

public class Drum implements Instrument {
    private String size;

    public Drum(String size) {
        this.size = size;
    }

    public Drum() {
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Drum drum = (Drum) o;
        return Objects.equals(size, drum.size);
    }

    @Override
    public int hashCode() {

        return Objects.hash(size);
    }

    @Override
    public String toString() {
        return "Drum{" +
                "size=" + size +
                '}';
    }

    @Override
    public void play() {
        System.out.println("Играет барабан. Его размер " + getSize());
    }
}
