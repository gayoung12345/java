package com.example.thread;

import java.util.ArrayList;

// chef1,2,3 을 ArrayList에 추가하고 for each 루프를 사용하여 각 스레드에 대해 join()을 호출
public class RestaurantArrayListMain implements Runnable {
    public static void main(String[] args) {
        // 요리사들을 ArrayList에 추가
        ArrayList<Chef> chefs = new ArrayList<>();
        chefs.add(new Chef("요리사1", "스테이크"));
        chefs.add(new Chef("요리사2", "스테이크"));
        chefs.add(new Chef("요리사3", "스테이크"));
        // 요리사 스레드 시작
        for (Chef chef : chefs) {
            chef.start();
        }
        // 요리사들의 스레드가 종료될 때 까지 기다림
        for (Chef chef : chefs) {
            try {
                chef.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        // 모든 요리 완료 후 배달
        System.out.println("완성된 요리를 배달을 합니다.");

    }

    @Override
    public void run() {

    }
}
