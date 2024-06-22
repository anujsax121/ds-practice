package com.practice.java8.employee;

import java.util.List;
import java.util.stream.Collectors;

import static com.practice.java8.employee.EmployeeFactory.getEmployeeList;

public class Departments {

    public static void main(String[] args) {
        List<String> departments = getEmployeeList()
                .stream()
                .map(Employee ::getDeptName)
                .distinct()
                .collect(Collectors.toList());
        System.out.println("All departments "+departments);
    }
}
