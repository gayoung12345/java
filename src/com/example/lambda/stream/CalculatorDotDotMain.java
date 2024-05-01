package com.example.lambda.stream;

// 메소드 참조(::)를 사용하여 이 메소드를 Calculator interface의 div 메소드와 연결
// Calculator::divide 나눗셈 연산 메소드
public class CalculatorDotDotMain {

    // 나눗셈 메소드
    public static double divide(double x, double y) {
        if (y == 0) {
            System.out.println("0으로 나눌 수 없습니다.");
            return 0;
        } else {
            return x / y;
        }
    }

    // 메인 메소드
    public static void main(String[] args) {
        // 람다 표현식을 사용하여 Calculator interface 구현
        // Calculator interface에 대한 메소드 참조를 정의
        Calculator division = CalculatorDotDotMain::divide;
        // 연산 테스트
        double num1 = 10;
        double num2 = 5;
        System.out.println("나눗셈 결과: " + division.cal(num1, num2));
    }


}
