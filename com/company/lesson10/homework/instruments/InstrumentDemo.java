package com.company.lesson10.homework.instruments;

public class InstrumentDemo {
    public static void main(String[] args) {
        Guitar electro = new Guitar(6);
        Guitar acoustic = new Guitar();
        acoustic.setAmountOfStrings(5);
        Drum drumBig = new Drum("большой");
        Drum drumSmall = new Drum();
        drumSmall.setSize("средний");
        Trumpet trumpet1 = new Trumpet(12.5);
        Trumpet trumpet2 = new Trumpet(21);
        Instrument[] instruments = {electro, drumBig, trumpet1, trumpet2, acoustic, drumSmall};
        for (Instrument instrument : instruments) {
            instrument.play();
        }
    }
}
