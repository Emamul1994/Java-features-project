package com.features.java8.optional;

import java.util.Optional;

public class OrElseGetOptionalExample {
    public static void main(String[] args) {
        String name = null;
        String myName = Optional.ofNullable(name).orElseGet(() -> "Emamul");
        System.out.println(myName);
    }
}
