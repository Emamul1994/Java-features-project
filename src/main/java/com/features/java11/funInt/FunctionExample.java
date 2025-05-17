package com.features.java11.funInt;

import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {

        Function<String, Integer> stringToInt = str -> Integer.valueOf(str);
        Integer applyReturnValue = stringToInt.apply("5");
        System.out.println(applyReturnValue);
    }
}
