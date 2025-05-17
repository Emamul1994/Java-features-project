package com.features.java11.funInt;

import java.util.function.Predicate;

public class PredicateExample {

    public static void main(String[] args) {
        Predicate<Person> predicate = (person) -> person.getAge() >= 30;
        boolean ageFlag = predicate.test(new Person(1, "Sami", 39));
        System.out.println(ageFlag);
    }
}
