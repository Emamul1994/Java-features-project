package com.features.java11;

import java.util.Arrays;
import java.util.List;

public class CollectionToArrayExample {
    public static void main(String[] args) {
        List<String> list = List.of("Hello", "Mr.", "Emamul");
        String[] strings = list.toArray(String[]::new);
        for(String str : strings) {
            System.out.print(str + " ");
        }
    }
}
