package com.features.java11;

public class StringLinesExample {
    public static void main(String[] args) {
        String string = "Java\n11\nfeatures";
        string.lines().forEach(System.out::println);
    }
}
