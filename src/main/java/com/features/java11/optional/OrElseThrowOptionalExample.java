package com.features.java11.optional;

import java.util.Optional;

public class OrElseThrowOptionalExample {
    public static void main(String[] args) {
        String name = null;
        String notFound = Optional.ofNullable(name).orElseThrow(() -> new IllegalArgumentException("Not Found"));
        System.out.println(notFound);
    }
}
