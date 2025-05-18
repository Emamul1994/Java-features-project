package com.features.java8.lambda;

interface Sayable {
    void say();
}

public class LambdaExpressionNoArguments {
    public static void main(String[] args) {
        Sayable s = () -> System.out.println("Running Application");
        s.say();
    }
}
