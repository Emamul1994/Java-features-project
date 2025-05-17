package com.features.java11.stream;

import java.util.Arrays;

public class SkipStreamExample {
    public static void main(String[] args) {
        Arrays.asList(1,4,3,7,2,5,9,8).stream().skip(3).forEach(System.out::println);
    }
}
