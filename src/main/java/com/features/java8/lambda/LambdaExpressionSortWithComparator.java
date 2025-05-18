package com.features.java8.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Person {
    int age;
    String name;

    public Person() {
    }

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class LambdaExpressionSortWithComparator {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person(21, "Sami"));
        persons.add(new Person(18, "Aryan"));
        persons.add(new Person(30, "Abid"));
        persons.add(new Person(15, "Ajaj"));
        persons.add(new Person(12, "Meraj"));
        persons.add(new Person(25, "Akki"));

        Collections.sort(persons, (p1, p2) -> {
                return p1.age - p2.age;
        });
        persons.stream().forEach(person -> {
            System.out.println(person.age + " : " + person.name);
        });
    }
}
