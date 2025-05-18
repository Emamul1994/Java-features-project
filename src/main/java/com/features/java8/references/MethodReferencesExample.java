package com.features.java8.references;

import java.util.Arrays;
import java.util.List;

public class MethodReferencesExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ameen", "Sami", "Rustam", "Sakil", "Naseem");
        names.forEach(System.out::println);
    }
}
