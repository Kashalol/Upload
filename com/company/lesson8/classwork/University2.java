package com.company.lesson8.classwork;

class Aspirant extends Student {
    private String work;

    public Aspirant(String firstName, String lastName, String group, double averageMark, String work) {
        super(firstName, lastName, group, averageMark);
        this.work = work;
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }
    public int getScholarship(){
        if (getAverageMark() == 5){
            return 100;
        }else{
            return 80;
        }
    }
}
public class University2{
public static void main(String[]args){
        Student student1 = new Student("Ivan","Ivanov","Java",4.5);
        Aspirant aspirant1 = new Aspirant("Petr","Petrov","C++",5,"c++ in Java");
    System.out.println(student1.getFirstName());
    System.out.println(student1.getAverageMark());
    System.out.println(aspirant1.getWork());
    Student aspirant2 = new Aspirant("0","0","0",0.0,"0");
    System.out.println(aspirant2.getAverageMark());
    Student[] students={student1,aspirant1,aspirant2};
    for (Student student3 : students){
        System.out.println(student3.getScholarship());
    }
        }
        }
