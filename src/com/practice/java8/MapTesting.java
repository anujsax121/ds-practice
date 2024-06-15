package com.practice.java8;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class MapTesting {

    public static void main(String[] args) {
        Map<Person, Integer> map = new HashMap<>();
        Person p1 = new Person("Anuj");
      //  Person p2 = new Person("Anuj");
       System.out.println(p1.hashCode());
        map.put(p1, 1);
      //  map.put(p2, 2);
        System.out.println(map);
        p1.setName("Anuj");
        System.out.println(map);
        System.out.println(p1.hashCode());
        Integer val = map.get(p1);
        System.out.println(val);

    }
}

class Person {

    private String name;

    Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return name.equals(person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}

