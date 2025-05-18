package com.features.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CreateStreamExample {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Amit", "Ameen", "Sharif", "Kudus");
        Stream<String> streamList = list.stream();
        streamList.forEach(System.out::println);
    }
}
