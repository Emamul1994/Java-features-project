package com.features.java8.collectors;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectorsExample {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Ameen", "Sakil", "Ameen", "Sufi");
        Map<Integer, List<String>> nameMap = list.stream().collect(Collectors.groupingBy(String::length));
        System.out.println(nameMap);

    }
}
