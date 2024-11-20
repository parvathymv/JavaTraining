package com.training.java8;

import java.util.*;
import java.util.stream.Collectors;

class Employee {
    String name;
    String department;

    Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }

    @Override
    public String toString() {
        return name + " (" + department + ")";
    }
}

public class StreamDemo3 {
    public static void main(String[] args) {
    	
        List<Employee> employees = List.of(
            new Employee("Alice", "HR"),
            new Employee("Bob", "Finance"),
            new Employee("Charlie", "HR"),
            new Employee("David", "IT"),
            new Employee("Eve", "Finance")
        );

        // Group employees by department
        Map<String, List<Employee>> groupedByDept = employees.stream()
                                                             .collect(Collectors.groupingBy(emp -> emp.department));

        System.out.println(groupedByDept);
    }
}



