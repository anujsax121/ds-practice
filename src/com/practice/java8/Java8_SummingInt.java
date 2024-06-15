package com.practice.java8;

import java.util.List;
import java.util.stream.Collectors;

public class Java8_SummingInt {

    public static void main(String[] args) {
        List<Employee> list = EmployeeFactory.getAllEmployee();
        Integer salarySum = list.stream().collect(Collectors.summingInt(Employee::getSalary));
        System.out.println(salarySum);
    }
}
