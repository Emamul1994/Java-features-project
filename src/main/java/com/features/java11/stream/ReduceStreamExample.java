package com.features.java11.stream;

import java.util.Arrays;
import java.util.function.BinaryOperator;

public class ReduceStreamExample {
    public static void main(String[] args) {
        int sum = Arrays.asList(1, 3, 2, 4, 5, 6).stream()
                .reduce(0, (a, b) -> (a + b)).intValue();
        System.out.println(sum);
    }
}
