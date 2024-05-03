package com.example.codingproblem.q10;

import java.util.Random;

class OddException extends Exception {
}

public class Sample {

    static void execute(int n) throws OddException {
        System.out.println("입력 숫자: " + n);
        if (n % 2 == 1) {   // 홀수면 OddException 발생
            throw new OddException();
        }
        System.out.println("짝수입니다.");
    }

    public static void main(String[] args) {
        Random r = new Random();
        for (int i = 1; i <= 10; i++) {
            try {
                System.out.print(i + "회 실행 ");
                execute(r.nextInt(10));
            } catch (OddException e) {
                e.printStackTrace();
            }
        }
    }
}
