package com.features.java8.optional;

import java.util.Optional;

public class OrElseOptionalExample {
    public static void main(String[] args) {
        String name = Optional.of("Emamul").orElse("No match name found");
        System.out.println(name);
    }
}
