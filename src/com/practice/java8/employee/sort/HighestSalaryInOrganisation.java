package com.practice.java8.employee.sort;

import com.practice.java8.employee.Employee;

import java.util.Comparator;

import static com.practice.java8.employee.EmployeeFactory.getEmployeeList;

public class HighestSalaryInOrganisation {

    public static void main(String[] args) {
        Employee employee = getEmployeeList().stream()
                .sorted(Comparator.comparing(Employee ::getSalary).reversed()).findFirst().get();
        System.out.println("Highest Salary in the organisation : " + employee.getSalary());
    }
}
