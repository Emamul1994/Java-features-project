package com.features.java11.stream;

import java.util.Arrays;

public class AnyMatchStreamExample {
    public static void main(String[] args) {
        boolean anyMatchFlag = Arrays.asList("Amit", "Akash", "Ameen", "Billu", "Babul", "Sami")
                .stream().anyMatch(name -> name.startsWith("A"));
        System.out.println(anyMatchFlag);
    }
}
