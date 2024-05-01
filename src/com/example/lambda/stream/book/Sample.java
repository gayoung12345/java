package com.example.lambda.stream.book;

@FunctionalInterface
interface Calculator {
    int sum(int a, int b);
}

public class Sample {
    public static void main(String[] args) {
//        Calculator mc = (a, b) -> a + b;
        // 메소드 참조 ::을 사용하여, Calculator interface와 Integer class의 sum method를 연결
        Calculator mc = Integer::sum;
        int result = mc.sum(3, 4);
        System.out.println(result);
    }
}
