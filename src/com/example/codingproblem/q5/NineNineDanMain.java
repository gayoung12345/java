package com.example.codingproblem.q5;

import java.util.Scanner;

public class NineNineDanMain {
    public static void main(String[] args) {
        System.out.print("구구단을 출력할 숫자를 입력하세요(2~9): ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        // 구구단 범위를 벗어남
        while(num<2||num>9) {
            System.out.print("구구단 범위(2~9)를 벗어났습니다. 다시 숫자를 입력하세요: ");
            num = scanner.nextInt();
        }
        for (int i = 1; i <= 9; i++) {
            System.out.print(num * i + " ");
        }
    }
}
