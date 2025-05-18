package com.features.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectStreamExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Amit", "Deepa", "Danish", "Suresh", "Damini")
                .stream().filter(name -> name.startsWith("D"))
                .collect(Collectors.toList());
        System.out.println(names);
    }
}
