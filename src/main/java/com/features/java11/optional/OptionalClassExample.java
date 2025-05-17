package com.features.java11.optional;

import java.util.Optional;

public class OptionalClassExample {
    public static void main(String[] args) {
        Optional<String> gender = Optional.of("Male");
        String ans1 = "Yes";
        String ans2 = null;

        System.out.println("Non Empty Optional: " + gender);
        System.out.println("Non Empty Optional Value: " + gender.get());
        System.out.println("Empty Optional: " + Optional.empty());

        System.out.println("OfNullable on Non Empty Optional" + Optional.ofNullable(ans1));
        System.out.println("OfNullable on Empty Optional: " + Optional.ofNullable(ans2));
        // Throw NullPointerException
        //System.out.println("OfNullable on Empty Optional: " + Optional.of(ans2));
    }
}
