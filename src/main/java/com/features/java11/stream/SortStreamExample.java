package com.features.java11.stream;

import java.util.Arrays;
import java.util.Collections;

public class SortStreamExample {
    public static void main(String[] args) {
        //Ascending order
        Arrays.asList("Zaved ", "Sakil ", "Yunus ", "Fahad ", "Kasim ")
                .stream().sorted().forEach(System.out::print);
        System.out.println();
        //descending order
        Arrays.asList("Zaved ", "Sakil ", "Yunus ", "Fahad ", "Kasim ")
                .stream().sorted(Collections.reverseOrder()).forEach(System.out::print);
    }
}
