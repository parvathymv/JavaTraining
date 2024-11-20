package com.training.java8;

import java.util.List;
import java.util.stream.Collectors;

class Employeee {
    private String name;
    private String department;
    private double salary;

    public Employeee(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return name + " (" + department + ", $" + salary + ")";
    }
}

public class StreamDemo4 {
    public static void main(String[] args) {
        List<Employeee> employees = List.of(
            new Employeee("Alice", "HR", 50000),
            new Employeee("Bob", "Finance", 60000),
            new Employeee("Charlie", "HR", 70000),
            new Employeee("David", "IT", 80000),
            new Employeee("Eve", "Finance", 75000)
        );

        // Filter employees who work in the "Finance" department
        List<Employeee> financeEmployees = employees.stream()
                                                   .filter(emp -> "Finance".equals(emp.getDepartment()))
                                                   .collect(Collectors.toList());

        System.out.println("Finance Employees: " + financeEmployees);
    }
}


