package com.features.java8.funInt;

@FunctionalInterface
interface FunctionalIntDemo {
    void wave();
}

public class FunctionalInterfaceExample {
    public static void main(String[] args) {
        FunctionalIntDemo fs = () -> System.out.println("Hello Mr, Emamul");
        fs.wave();
    }
}
