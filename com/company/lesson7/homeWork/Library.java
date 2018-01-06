package com.company.lesson7.homeWork;

import java.util.Arrays;
import java.util.Scanner;

class ReaderTicket {
    String fullName;
    String ticketNumber;
    String speciality;
    String birthDate;
    String phoneNumber;

    public ReaderTicket(String fullName, String ticketNumber, String speciality, String birthDate, String phoneNumber) {
        this.fullName = fullName;
        this.ticketNumber = ticketNumber;
        this.speciality = speciality;
        this.birthDate = birthDate;
        this.phoneNumber = phoneNumber;
    }

    public ReaderTicket() {
    }

    public void readerTicketInfoPrint() {
        String fullReaderTicketInfo = "Full name : " + fullName + "\nTicket number : " + ticketNumber + "\nSpeciality : " + speciality + "\nBirth date : " + birthDate + "\nPhone number : " + phoneNumber + "\n ";
        System.out.println(fullReaderTicketInfo);
    }

    public String readerTicketOut() {
        String fullReaderTicketInfo = "Full name : " + fullName + "\nTicket number : " + ticketNumber + "\nSpeciality : " + speciality + "\nBirth date : " + birthDate + "\nPhone number : " + phoneNumber + "\n ";
        return fullReaderTicketInfo;
    }

    public static void arrayOfTickets(String... readerTicket) {
        String[] ticketArray = new String[readerTicket.length];
        for (int i = 0; i < readerTicket.length; i++) {
            ticketArray[i] = readerTicket[i];
        }
        System.out.println(Arrays.toString(ticketArray));
    }
}

class Book {
    String bookName;

    public Book(String name) {
        this.bookName = name;
    }
}

public class Library {
    public static void main(String[] args) {
        ReaderTicket readerTicket1 = new ReaderTicket("John Smithson", "01", "Java", "01.01.1999", "3720001");
        ReaderTicket readerTicket2 = new ReaderTicket("Smith Johnson", "02", "C++", "02.02.1999", "3720002");
        ReaderTicket readerTicket3 = fillingReaderTicket03();
        ReaderTicket.arrayOfTickets(readerTicket1.readerTicketOut(), readerTicket2.readerTicketOut(), readerTicket3.readerTicketOut());
    }

    public static ReaderTicket fillingReaderTicket03() {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите данные для нового читательского билета \nВведите имя :");
        String fullName = input.nextLine();
        String ticketNumber = "03";
        System.out.println("Введите факультет");
        String speciality = input.nextLine();
        System.out.println("Введите дату рождения в формате Число.Месяц.Год :");
        String birthDate = input.nextLine();
        System.out.println("Введите номер телефона читателя");
        String phoneNumber = input.nextLine();
        ReaderTicket readerTicket3 = new ReaderTicket(fullName, ticketNumber, speciality, birthDate, phoneNumber);
        return readerTicket3;
    }

    public void takeBook(int amount) {
    }

    public void takeBook(String... names) {
    }

    public void takeBook(Book... books) {
    }

    public void returnBook(int amount) {
    }

    public void returnBook(String... names) {
    }

    public void returnBook(Book... books) {
    }
}
