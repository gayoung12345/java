package com.example.thread;

public class RestaurantJoinMain {
    public static void main(String[] args) {
        // 요리사를 생성
        Chef chef1 = new Chef("요리사1", "스테이크");
        Chef chef2 = new Chef("요리사2", "파스타");
        Chef chef3 = new Chef("요리사3", "샐러드");
        chef1.start();
        chef2.start();
        chef3.start();
        // 각 요리사의 스레드가 종료될 때 까지 기다림
        try {
            chef1.join();
            chef2.join();
            chef3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // 모든 요리가 완료된 후에 배달
        System.out.println("완성된 요리를 배달을 합니다.");
    }
}
