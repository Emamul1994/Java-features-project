package com.features.java8.optional;

import java.util.Optional;

public class IfPresentOptionalExample {
    public static void main(String[] args) {
        Optional.of("Emamul").ifPresent(name -> System.out.println(name.length()));
    }
}
