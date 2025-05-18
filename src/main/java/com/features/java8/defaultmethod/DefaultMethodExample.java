package com.features.java8.defaultmethod;

interface IMyInterface {
    default void defaultMethod() {
        System.out.println("Default method implementation in interface");
    }
}

class DefaultMethod implements IMyInterface {
    @Override
    public void defaultMethod() {
        System.out.println("Default method implemented in implementation class");
    }
}

public class DefaultMethodExample {
    public static void main(String[] args) {
        DefaultMethod df = new DefaultMethod();
        df.defaultMethod();
    }
}
