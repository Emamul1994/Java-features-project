package com.features.java8.optional;

import java.util.Optional;

public class IsPresenceOptionalExample {
    public static void main(String[] args) {
        Optional<String> name1 = Optional.of("Emamul");
        //Optional<String> name2 = Optional.of(null);
        Optional<Object> empty = Optional.empty();
        System.out.println(name1.isPresent());
        System.out.println(empty.isPresent());
    }
}
