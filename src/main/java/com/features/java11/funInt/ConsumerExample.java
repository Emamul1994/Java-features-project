package com.features.java11.funInt;

import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        Consumer<Person> consumer = person -> {
            System.out.println("Person Name: " + person.getName());
            System.out.println("Person Age: " + person.getAge());
        };
        consumer.accept(new Person(1, "Sharif", 25));
    }
}
