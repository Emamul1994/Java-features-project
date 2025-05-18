package com.features.java8.stream;

import java.util.Arrays;

public class FindFirstStreamExample {
    public static void main(String[] args) {
        String firstName = Arrays.asList("Anas", "Zimmy", "Emamul").stream()
                .findFirst().orElse("No Such a Name");
        System.out.println("First Name in the List: " + firstName);
    }
}
