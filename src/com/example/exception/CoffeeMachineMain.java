package com.example.exception;

// 커피 재료가 부족할 때 발생하는 예외 클래스 정의
class CoffeeMachineException extends Exception {
    public CoffeeMachineException(String message) {
//        super(message);
        System.out.println(message);
    }
}

// 커피 머신 클래스
class CoffeeMachine {
    private int coffeeStock = 10; // 커피 재고
    // 커피 주문 메소드
    public void orderCoffee(int quantity) throws CoffeeMachineException {
        if (quantity > coffeeStock) {
            throw new CoffeeMachineException("We're out of stock");
        }
    }
}

public class CoffeeMachineMain {
    public static void main(String[] args) {
        CoffeeMachine coffeeMachine = new CoffeeMachine();
        try {
            coffeeMachine.orderCoffee(11);
        } catch (CoffeeMachineException e) {
//            e.getMessage();
            System.out.println("커피가 부족하니 다른 품목을 선택하세요. ");
        }
    }
}
