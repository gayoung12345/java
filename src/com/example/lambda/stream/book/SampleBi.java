package com.example.lambda.stream.book;

import java.util.function.BiFunction;

public class SampleBi {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> mc = (a, b) -> a + b;
        int result = mc.apply(1, 2);    // apply(a,b) : a+b의 값 반환
        System.out.println(result);
    }
}
