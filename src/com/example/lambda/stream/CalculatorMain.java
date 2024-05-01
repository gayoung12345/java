package com.example.lambda.stream;

@FunctionalInterface
interface Calculator {
    // interface이므로 하나의 추상메소드만 작성 할 수 있음
//    double add(double x, double y);
//    double sub(double x, double y);
//    double mul(double x, double y);
//    double div(double x, double y);
    double cal(double x, double y);
}

public class CalculatorMain {
    public static void main(String[] args) {
        // Calculator interface에 대한 람다 표현식 정의
        Calculator addition = (x, y) -> x+y;
        Calculator subtraction = (x, y) -> x-y;
        Calculator multiplication = (x, y) -> x*y;
        Calculator division = (x, y) -> {
            if(y == 0) {
                System.out.println("0으로 나눌 수 없습니다.");
                return 0;
            } else {
                return x/y;
            }
        };
        // 사칙연산 테스트
        double n1 = 10;
        double n2 = 5;
//        System.out.println("덧셈 결과: " + addition.add(n1, n2));
//        System.out.println("뺄셈 결과: " + subtraction.sub(n1, n2));
//        System.out.println("곱셈 결과: " + multiplication.mul(n1, n2));
//        System.out.println("나눗셈 결과: " + division.div(n1, n2));
        System.out.println("덧셈 결과: " + addition.cal(n1, n2));
        System.out.println("뺄셈 결과: " + subtraction.cal(n1, n2));
        System.out.println("곱셈 결과: " + multiplication.cal(n1, n2));
        System.out.println("나눗셈 결과: " + division.cal(n1, n2));
    }
}
