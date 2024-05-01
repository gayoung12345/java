package com.example.lambda.stream;

import java.util.Arrays;

public class CalculatorStreamMain {
    // 메인 메소드
    public static void main(String[] args) {
        Calculator2 addition = CalculatorVarMain::sum;
        double result = addition.cal(100,2,3,4,5);

        // stream을 사용하여 sum() = result 값이 100을 초과한다면, map()으로 result 값을 100으로 대체하는 새로운 스트림을 생성하고 forEach()를 사용해 출력
        Arrays.stream(new double[]{result}).map(num -> Math.min(num,100)).forEach(System.out::println);
        // map(): 스트림 내의 각 요소에 대해 특정 작업을 수행하는 함수를 적용하여 새로운 스트림을 생성하는 역할
        // Math.min(a,b): a와 b 중에 작은 값을 반환
    }
}
