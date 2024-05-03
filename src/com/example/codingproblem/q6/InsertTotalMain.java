package com.example.codingproblem.q6;

import java.util.Scanner;

public class InsertTotalMain {
    public static void main(String[] args) {
        System.out.print("총 합을 구할 정수들 입력(,로 구분): ");
        Scanner scanner = new Scanner(System.in);   // scanner로 항의 수를 받음
        String inputNum = scanner.nextLine();
        String[] numbers = inputNum.split(",");
        int sum = 0;
        for (String number : numbers) {
            number = number.trim(); // trim():문자열 앞뒤의 공백 삭제
            sum += Integer.parseInt(number);
        }
        System.out.println(sum);

    }
}
