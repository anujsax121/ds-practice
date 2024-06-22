package com.practice.java8.employee.grouping;

import com.practice.java8.employee.Employee;

import static com.practice.java8.employee.EmployeeFactory.getEmployeeList;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeByCity {

    public static void main(String[] args) {
        Map<String, List<Employee>> empByCity = getEmployeeList()
                .stream()
                .collect(Collectors.groupingBy(Employee::getCity));
        System.out.println("Employees grouped by city :: \n" + empByCity);

    }
}
