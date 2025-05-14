package com.features.java11.lambda;

interface SingleArguments {
    void print(String message);
}

public class LambdaExpressionSingleArguments {
    public static void main(String[] args) {
        SingleArguments sa = message -> System.out.println("print Name: " + message);
        sa.print("Emamul");
    }
}
