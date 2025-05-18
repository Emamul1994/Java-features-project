package com.features.java11;

public class StringStripExample {
    public static void main(String[] args) {
        String str = "   Hello Emamul   ";
        System.out.println("Strip: " + str.strip());
        System.out.println("Strip Leading: " + str.stripLeading());
        System.out.println("Strip Trailing: " + str.stripTrailing());
    }
}
