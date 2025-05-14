package com.features.java11.lambda;

interface MultiArguments {
    int add(int num1, int num2);
}

public class LambdaExpressionMultiArguments {
    public static void main(String[] args) {
        MultiArguments ma = (num1, num2) -> {
          return num1 + num2;
        };
        int add = ma.add(10, 20);
        System.out.println("Addition: " + add);
    }
}
