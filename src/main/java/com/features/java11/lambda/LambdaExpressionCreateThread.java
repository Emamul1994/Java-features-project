package com.features.java11.lambda;

public class LambdaExpressionCreateThread {
    public static void main(String[] args) {
        Runnable rn = () -> System.out.println("Lambda Expression thread creation....");
        Thread th = new Thread(rn);
        th.start();
    }
}
