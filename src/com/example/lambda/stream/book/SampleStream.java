package com.example.lambda.stream.book;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;

public class SampleStream {
    public static void main(String[] args) {

        int[] data = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        // 짝수만 포함하는 ArrayList 생성
        ArrayList<Integer> dataList = new ArrayList<>();
        for (int i = 0; i < data.length; i++) {
            if(data[i] % 2 == 0) {
                dataList.add(data[i]);
            }
        }

        // Set을 사용하여 중복 제거
        HashSet<Integer> dataSet = new HashSet<>(dataList);

        // Set을 다시 List로 변경
        ArrayList<Integer> distinctList = new ArrayList<>(dataSet);

        // 역순 정렬
        distinctList.sort(Comparator.reverseOrder());

        // IntegerList를 정수 배열로 변환
        int[] result = new int[distinctList.size()];
        for(int i = 0; i < distinctList.size(); i++) {
            result[i] = distinctList.get(i);
        }

        // 출력
        for (int i : result) {
            System.out.print(i + " ");
        }
    }
}
