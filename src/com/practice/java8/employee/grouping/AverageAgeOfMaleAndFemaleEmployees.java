package com.practice.java8.employee.grouping;

import com.practice.java8.employee.Employee;

import java.util.Map;
import java.util.stream.Collectors;

import static com.practice.java8.employee.EmployeeFactory.getEmployeeList;

public class AverageAgeOfMaleAndFemaleEmployees {

    public static void main(String[] args) {
        Map<String, Double> avgAge = getEmployeeList().stream()
                .collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge)));
        System.out.println("Average age of Male and Female Employees:: " + avgAge);
    }
}
