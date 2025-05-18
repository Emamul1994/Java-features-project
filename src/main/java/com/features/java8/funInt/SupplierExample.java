package com.features.java8.funInt;

import java.util.function.Supplier;

public class SupplierExample {

    public static void main(String[] args) {
        Supplier<Person> sp = () -> {
            return new Person(2, "Ameen", 35);
        };
        Person person = sp.get();
        System.out.println(person.getId() + " " + person.getName() + " " + person.getAge());
    }
}
