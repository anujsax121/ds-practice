package com.practice.java8;

import java.util.List;
import java.util.stream.Collectors;

public class App {

    public static void main(String[] args) {
        EmployeeFactory employeeFactory = new EmployeeFactory();
        List<Employee> employeeList = employeeFactory.getAllEmployee();

        System.out.println("List all distinct project in non-ascending order.");
        List<String> productNames = employeeList.stream().flatMap(e -> e.getProjects().stream()).distinct()
                .map(Project::getName).sorted()
                .collect(Collectors.toList());
        System.out.println(productNames);

        System.out.println("Print full name of any employee whose firstName starts with ‘A’.");

        List<String> listFullNames = employeeList.stream().filter(f -> f.getFirstName().startsWith("A"))
                .map(m -> m.getFirstName() + " " + m.getLastName())
                .collect(Collectors.toList());

        System.out.println(listFullNames);

        System.out.println("List of all employee who joined in year 2023 (year to be extracted from employee id i.e., 1st 4 characters)");




    }
}
