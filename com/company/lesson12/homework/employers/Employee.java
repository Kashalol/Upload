package com.company.lesson12.homework.employers;

import java.util.Objects;

public class Employee {
    private String fullname;
    private double salary;

    public Employee(String fullname, double salary) {
        this.fullname = fullname;
        this.salary = salary;
    }

    public Employee() {
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Double.compare(employee.salary, salary) == 0 &&
                Objects.equals(fullname, employee.fullname);
    }

    @Override
    public int hashCode() {

        return Objects.hash(fullname, salary);
    }

    @Override
    public String toString() {
        return "Employee " +
                fullname + '\'' +
                "salary = " + salary;
    }
}
