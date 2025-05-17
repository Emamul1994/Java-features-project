package com.features.java11.stream;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapStreamExample {
    public static void main(String[] args) {
        List<List<String>> nestedList = Arrays.asList(
                Arrays.asList("Ameen", "Sami", "Kadari"),
                Arrays.asList("Zaved", "Sahil", "Munir")
        );
        System.out.println(nestedList);
        List<String> nameList = nestedList.stream().flatMap(List::stream).collect(Collectors.toList());
        System.out.println(nameList);
        System.out.println();

        List<String> collect = Arrays.asList(
                Arrays.asList("Ameen", "Sami", "Kadari"),
                Arrays.asList("Zaved", "Sahil", "Munir"),
                Arrays.asList("Hussain", "Ali", "Dawid")
        ).stream().flatMap(Collection::stream).collect(Collectors.toList());
        System.out.println(collect);
    }
}
