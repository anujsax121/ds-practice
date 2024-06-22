package com.practice.java8.employee.filter;

import com.practice.java8.employee.Employee;
import com.practice.java8.employee.exception.NotFound;

import java.util.stream.Collectors;

import static com.practice.java8.employee.EmployeeFactory.getEmployeeList;

public class EmployeeByAgeBasisOnConditions {

    public static void main(String[] args) {

        System.out.println("Employee details whose age is greater than 28");
        getEmployeeList()
                .stream().filter(e -> e.getAge() > 28)
                .forEach(System.out::println);

        System.out.println("Found employees from HR department ");
       Employee employee =  getEmployeeList()
                .stream().filter(e -> e.getDeptName().equals("HR"))
                .findAny().orElseThrow(() -> new NotFound("Not Employee..."));
        System.out.println("Found employees from HR department " + employee);

    }
}
