package com.practice.java8.employee.grouping;

import com.practice.java8.employee.Employee;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static com.practice.java8.employee.EmployeeFactory.getEmployeeList;

public class EmployeesByAge {

    public static void main(String[] args) {

        Map<Integer, List<Employee>> empByAge = getEmployeeList()
                .stream()
                .collect(Collectors.groupingBy(Employee::getAge));
        System.out.println("Employees grouped by age :: \n" + empByAge);

    }
}
