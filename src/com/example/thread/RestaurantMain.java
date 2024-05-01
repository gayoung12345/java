package com.example.thread;

class Chef extends Thread {
    private String name;
    private String dish;

    public Chef(String name, String dish) {
        this.name = name;
        this.dish = dish;
    }
    // Thread를 상속했으므로, run method를 구현해야함
    @Override
    public void run() {
        System.out.println(name + "가 " + dish + "를 요리합니다.");
        try {
            Thread.sleep(2000); // cooking time: 2sec
        } catch (InterruptedException e) { // thread interrupted : 스레드가 대기상태일 때 발생하는 오류
            e.getStackTrace();  // 응용 프로그램(Application)이 시작된 시점부터 프로그램 내에서 현재 실행(오류발생)위치까지의 메서드 호출 목록 보여줌
        }
        System.out.println(name + "이 " + dish + "를 완성했습니다.");
    }
}

public class RestaurantMain {
    public static void main(String[] args) {
        // 요리사를 생성
        Chef chef1 = new Chef("요리사1", "스테이크");
        Chef chef2 = new Chef("요리사2", "파스타");
        Chef chef3 = new Chef("요리사3", "샐러드");
        chef1.start();
        chef2.start();
        chef3.start();
    }
}
