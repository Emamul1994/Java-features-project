package com.features.java8.staticmethod;

interface IMyInterface {
    public static void staticMethods() {
        System.out.println("Static methods implementation in interface");
    }
}

public class StaticMethodExample {
    public static void main(String[] args) {
        IMyInterface.staticMethods();
    }
}
