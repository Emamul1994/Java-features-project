package com.features.java8.stream;

import java.util.Arrays;

public class ParallelStreamExample {
    public static void main(String[] args) {
        Arrays.asList("Anas", "Ameen", "Iliyas", "Akki", "Sam", "Sami", "Raju")
                .parallelStream().forEach(name -> System.out.println("Name: " + name + " - " + Thread.currentThread().getName()));
    }
}
