package com.example.codingproblem.q12;

import java.util.Scanner;

public class StringMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("문자열을 입력하세요:");
        String input = scanner.nextLine();

        String compressedString = compressString(input);

        System.out.println("압축된 문자열: " + compressedString);
    }

    public static String compressString(String str) {
        StringBuilder compressed = new StringBuilder();

        int count = 1;
        for (int i = 0; i < str.length(); i++) {
            // 현재 문자와 다음 문자가 같은지 확인
            if (i + 1 < str.length() && str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {
                // 다음 문자가 다르면 현재 문자와 반복 횟수를 추가
                compressed.append(str.charAt(i));
                compressed.append(count);
                // 반복 횟수 초기화
                count = 1;
            }
        }

        return compressed.toString();
    }
}