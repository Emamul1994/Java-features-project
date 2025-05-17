package com.features.java11.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LimitStreamExample {
    public static void main(String[] args) {
        List<Integer> limitList = Arrays.asList(1, 4, 5, 2, 3, 7, 9).stream().limit(3).collect(Collectors.toList());
        System.out.println(limitList);
    }
}
