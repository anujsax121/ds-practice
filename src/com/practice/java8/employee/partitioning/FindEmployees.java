package com.practice.java8.employee.partitioning;

import com.practice.java8.employee.Employee;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import static com.practice.java8.employee.EmployeeFactory.getEmployeeList;

public class FindEmployees {

    public static void main(String[] args) {
        System.out.println("Employees whose age is greater than 25 and less than 25");
        Map<Boolean, List<Employee>> partitionEmployeesByAge = getEmployeeList()
                .stream()
                .collect(Collectors.partitioningBy(e -> e.getAge() > 30));

        for (Map.Entry<Boolean, List<Employee>> entry : partitionEmployeesByAge.entrySet()) {

            if (entry.getKey()) {
                System.out.println("Employees greater than 30 years ::" + entry.getValue());
            } else {
                System.out.println("Employees less than 30 years ::" + entry.getValue());
            }
        }

    }
}
