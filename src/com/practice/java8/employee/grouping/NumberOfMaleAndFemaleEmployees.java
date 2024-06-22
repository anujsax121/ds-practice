package com.practice.java8.employee.grouping;

import com.practice.java8.employee.Employee;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static com.practice.java8.employee.EmployeeFactory.getEmployeeList;


public class NumberOfMaleAndFemaleEmployees {

    public static void main(String[] args) {

        Map<String, Long> noOfMaleAndFemaleEmployees = getEmployeeList().stream()
                .collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));

        System.out.println("Count of male and female employees present in the organization:: \n" + noOfMaleAndFemaleEmployees);
    }
}
