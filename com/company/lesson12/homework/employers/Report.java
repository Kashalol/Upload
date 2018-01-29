package com.company.lesson12.homework.employers;

public class Report {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Ivan Ivanov", 898.45);
        Employee employee2 = new Employee("Mafusail Mafusailovich", 878.65);
        Employee employee3 = new Employee("Sidor Sidorov", 989.4);
        Employee employee4 = new Employee("Oleg Olegov", 798.4);
        Employee employee5 = new Employee("Petr Ivanov", 794.98);
        Employee[] employees = {employee1, employee2, employee3, employee4, employee5};
        generateReport(employees);
    }

    public static void generateReport(Employee[] employees) {
        for (Employee employeeIterate : employees) {
            System.out.printf("%nЗарплата сотрудника %s составляет " + blankSpaces(employeeIterate)
                    + "%10.2f", employeeIterate.getFullname(), employeeIterate.getSalary());
        }
    }

    public static String blankSpaces(Employee employeeIterate) {
        StringBuilder s = new StringBuilder(" ");
        for (int i = 0; i < 28 - employeeIterate.getFullname().length(); i++) {
            s.append(" ");
        }
        return s.toString();
    }
}
