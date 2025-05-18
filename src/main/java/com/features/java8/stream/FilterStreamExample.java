package com.features.java8.stream;

import java.util.Arrays;

public class FilterStreamExample {
    public static void main(String[] args) {
        Arrays.asList("Amit", "Ameen", "Sharif", "Kudus").stream()
                .filter(str -> str.startsWith("A"))
                .forEach(System.out::println);
    }
}
