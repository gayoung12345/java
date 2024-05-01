package com.example.lambda.stream.book;

import java.util.Arrays;
import java.util.Comparator;

public class SampleStream2 {
    public static void main(String[] args) {
        int[] data = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int[] result = Arrays.stream(data)  // stream 생성
                .boxed()    // IntStream을 Stream<Integer>로 변경 (int type -> Integer type)
                .filter((a)->a%2==0)    // 짝수만 걸러냄 (람다식)
                .distinct() // 중복 제거
                .sorted(Comparator.reverseOrder())  // 역순 정렬 (Integer type을 사용해야함)
                .mapToInt(Integer::intValue)    // Stream<Integer>를 IntStream으로 변경 (Integer type -> int type)
                .toArray(); // int[] 배열로 반환

        // compare(a,b) : a<b 음수반환 / a=b 0반환 / a>b 양수반환


        // 출력
        for (int i : result) {
            System.out.print(i + " ");
        }
    }
}
