package com.features.java11.lambda;

interface IAverage {
    double average(int[] arr);
}

public class LambdaExpressionMultiStatement {
    public static void main(String[] args) {
        IAverage avg = (int[] arr) -> {
            int sum = 0;
            for (int num : arr) {
                sum = sum + num;
            }
            System.out.println(sum);
            System.out.println(arr.length);
            return sum / arr.length;
        };
        double average = avg.average(new int[]{1, 3, 4, 2, 1,2});
        System.out.println("Average: " + average);
    }
}
