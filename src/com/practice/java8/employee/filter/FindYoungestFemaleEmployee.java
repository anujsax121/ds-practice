package com.practice.java8.employee.filter;

import com.practice.java8.employee.Employee;
import com.practice.java8.employee.exception.NotFound;

import java.util.Comparator;

import static com.practice.java8.employee.EmployeeFactory.getEmployeeList;

public class FindYoungestFemaleEmployee {

    public static void main(String[] args) {
        Employee youngestEmployee = getEmployeeList().stream().filter(e -> e.getGender().equals("F"))
                .min(Comparator.comparing(Employee::getAge)).orElseThrow(() -> new NotFound("Employee not found.."));

        System.out.println("Youngest Female employee details:: \n" + youngestEmployee);
    }
}
