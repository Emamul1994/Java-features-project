package com.features.java11.stream;

import java.util.Arrays;

public class MapStreamExample {
    public static void main(String[] args) {
        Arrays.asList("hello mr emamul", "how are you doing today").stream()
                .map(sentence -> sentence.toUpperCase())
                .forEach(System.out::println);
    }
}
