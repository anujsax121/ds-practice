package com.practice.java8.employee.sort;

import com.practice.java8.employee.Employee;

import java.util.Comparator;

import static com.practice.java8.employee.EmployeeFactory.getEmployeeList;

public class FindMaxAgeOfEmployee {

    public static void main(String[] args) {
         Employee employee = getEmployeeList().stream()
                  .max(Comparator.comparing(Employee::getAge)).orElseThrow(() -> new IllegalArgumentException());
        System.out.println("Maximum age of Employee: " + employee.getAge());
    }
}
