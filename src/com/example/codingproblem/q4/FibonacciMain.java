package com.example.codingproblem.q4;

import java.util.Scanner;

public class FibonacciMain {
    public static void main(String[] args) {
        System.out.print("정수 입력: ");

        Scanner scanner = new Scanner(System.in);   // scanner로 항의 수를 받음
        int num = scanner.nextInt();

        System.out.printf("%d항 이하 까지의 피보나치 수열: ",num);

        for (int i = 0; i < num; i++) {
            if(i==num-1) {
                System.out.print(calcRecursiveFibonacci(i));    // 마지막은 , 출력 X
            } else {
                System.out.print(calcRecursiveFibonacci(i) + ", ");
            }


        }

    }

     // 피보나치 수열의 연산식 F(N) = F(N-1) + F(N-2)
     // 피보나치 수열 구하는 재귀 함수
     public static int calcRecursiveFibonacci(int num) {
         if (num <= 1) {    // F(0) = 0, F(1) = 1
             return num;
         } else {
             // 재귀함수
             return calcRecursiveFibonacci(num - 1) + calcRecursiveFibonacci(num - 2);
         }
     }
}
