package com.features.java8.sort;

import java.util.Arrays;

public class ParallelSortExample {
    public static void main(String[] args) {

        int[] numbers = {5, 3, 8, 1, 9, 4, 7, 6, 2, 0};
        System.out.println("Before sorting: " + Arrays.toString(numbers));
        Arrays.parallelSort(numbers);
        System.out.println("After sorting: " + Arrays.toString(numbers));
    }
}
