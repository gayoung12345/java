package com.example.lambda.stream;

interface Calculator2 {
    double cal(double... numbers);
}

public class CalculatorVarMain {
    // 덧셈 메소드
    static double sum(double... numbers) {
        double result = 0;
        for (double number : numbers) {
            result += number;
        }
        return result;
    }
    // 나눗셈 메소드
    static double div(double... numbers) {
        if(numbers.length < 2) {
            System.out.println("최소 2개의 숫자가 필요합니다.");
            return 0;
        }
        double result = numbers[0]; // 0번지에 있는 값을 미리 넣었으므로
        for (int i = 1; i < numbers.length; i++) {  // for문이 1부터 시작함
            if(numbers[i] == 0) {
                System.out.println("0으로 나눌 수 없습니다.");
                return 0;
            }
            result /= numbers[i];
        }
        return result;
    }
    // 메인 메소드
    public static void main(String[] args) {
        // 람다 표현식을 사용하여 Calculator2 interface 구현
        // Calculator2 interface에 대한 메소드 참조를 정의
        Calculator2 addition = CalculatorVarMain::sum;
        Calculator2 division = CalculatorVarMain::div;
        // 연산 테스트
        System.out.println("덧셈 결과: "+addition.cal(1, 2, 3, 4, 5));
        System.out.println("나눗셈 결과: "+division.cal(10, 2, 3));
    }




}
