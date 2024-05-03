package com.example.book.ex.q5;

import java.util.ArrayList;
import java.util.Arrays;

public class Sample {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int[] result = Arrays.stream(numbers)
                .filter(n -> n % 2 == 1)    // 홀수
                .map(n -> n * 2)    // 2 곱하기
                .toArray()  // int[]로 출력
                ;

        System.out.println("int[] result = " + Arrays.toString(result));
    }

}
