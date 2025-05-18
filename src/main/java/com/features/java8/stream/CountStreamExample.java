package com.features.java8.stream;

import java.util.Arrays;

public class CountStreamExample {
    public static void main(String[] args) {
        long count = Arrays.asList("Delhi", "Bengaluru", "Hyderabad", "Patna")
                .stream().count();
        System.out.println("Count: " + count);
    }
}
