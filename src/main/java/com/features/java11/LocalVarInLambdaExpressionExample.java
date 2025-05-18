package com.features.java11;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class LocalVarInLambdaExpressionExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Asif", "Raju", "Sani", "Emam");
        Consumer<String> consumer = (var name) -> System.out.println(name);
        names.forEach(consumer);
    }
}
