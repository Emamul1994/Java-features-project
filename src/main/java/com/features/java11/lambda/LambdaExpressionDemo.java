package com.features.java11.lambda;

interface Drawable {
    void draw(int width);
}

public class LambdaExpressionDemo {
    public static void main(String[] args) {
        int width = 10;
        Drawable draw = (int number) -> {
            System.out.println("Drawing: " + number);
        };
        draw.draw(width);
    }
}
