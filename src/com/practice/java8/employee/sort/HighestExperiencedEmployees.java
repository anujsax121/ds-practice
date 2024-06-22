package com.practice.java8.employee.sort;

import com.practice.java8.employee.Employee;

import java.util.Comparator;

import static com.practice.java8.employee.EmployeeFactory.getEmployeeList;

public class HighestExperiencedEmployees {

    public static void main(String[] args) {
        Employee employee = getEmployeeList().stream()
                .sorted(Comparator.comparing(Employee::getYearOfJoining)).findFirst().get();
        System.out.println(employee);
    }
}
