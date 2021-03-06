package com.company.lesson10.homework.clothes;

public enum Sizes {
    XXS(40) {
        public String getDescription() {
            return "Детский размер";
        }
    }, XS(42), S(44), M(48), L(52);
    private int euroSize;

    Sizes(int euroSize) {
        this.euroSize = euroSize;
    }

    public int getEuroSize() {
        return euroSize;
    }

    public String getDescription() {
        return "Взрослый размер";
    }

    @Override
    public String toString() {
        return "euroSize=" + euroSize +
                " " + super.toString() + " " + getDescription();
    }
}
