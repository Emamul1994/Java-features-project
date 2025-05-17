package com.features.java11.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByStreamExample {
    public static void main(String[] args) {
        Map<Character, List<String>> groupByLetter = Arrays.asList("Ammit", "Ameen", "Sami", "Sam", "Raju")
                .stream().collect(Collectors.groupingBy(name -> name.charAt(0)));
        System.out.println(groupByLetter);
    }
}
