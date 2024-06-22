package com.practice.java8.employee.grouping;

import com.practice.java8.employee.Employee;

import java.util.Comparator;
import java.util.Map;
import java.util.stream.Collectors;

import static com.practice.java8.employee.EmployeeFactory.getEmployeeList;

public class EmployeesInEachDepartment {

    public static void main(String[] args) {
        Map<String, Long> map = getEmployeeList().stream()
                .collect(Collectors.groupingBy(Employee::getDeptName, Collectors.counting()));
        System.out.println("No of employees in each department");
        System.out.println(map);

        System.out.println("Max no of employees present in Dept");
        Map.Entry<String, Long> maxNoOfEmployeesInDept = getEmployeeList().stream()
                .collect(Collectors.groupingBy(Employee::getDeptName, Collectors.counting()))
                .entrySet().stream().max(Map.Entry.comparingByValue()).get();
        System.out.println("Max no of employees present in Dept :: " + maxNoOfEmployeesInDept.getKey());


        System.out.println("Department names where the number of employees in the department is over 3 :: ");
        getEmployeeList().stream().collect(Collectors.groupingBy(Employee::getDeptName, Collectors.counting())).
                entrySet().stream().filter(entry -> entry.getValue() > 3).forEach(System.out::println);

    }
}
