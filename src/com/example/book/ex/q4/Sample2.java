package com.example.book.ex.q4;

import java.util.Arrays;

public class Sample2 {
    public static void main(String[] args) {
        int[] numbers = {1, -2, 3, -5, 8 ,-3};  // 음수제거         int[]배열로 반환
        int[] result = Arrays.stream(numbers).filter(x -> x >= 0).toArray();
                            // IntStream 생성
        System.out.println("int[] result = " + Arrays.toString(result));
    }
}
