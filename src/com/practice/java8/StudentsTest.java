package com.practice.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StudentsTest {

    public static void main(String[] args) {
        List<Student> students = Arrays.asList(new Student("Chandra", 30), new Student("Rahul", 25)
                , new Student("Robert", 20));
        int min = students.stream().min(Comparator.comparing(Student::getAge)).get().getAge();
        int max = students.stream().max(Comparator.comparing(Student::getAge)).get().getAge();
        System.out.println("Age is Younger: " + min);
        System.out.println("Age is Older: " + max);
    }
}
