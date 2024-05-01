package com.example.thread;

public class SampleThread extends Thread {
    int seq;

    public SampleThread(int seq) {
        this.seq = seq;
    }
    public void run() {
        System.out.println(this.seq + " thread start. ");   // 스레드 시작
        try {
            Thread.sleep(1000); // 1초 대기
        } catch (Exception e) {
        }
        System.out.println(this.seq + " thread end."); // 스레드 종료
    }
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {  // 총 10개의 스레드 생성 후 실행
            Thread thread = new SampleThread(i);
            thread.start();
        }
        System.out.println("main end. "); // main 메소드 종료
        // * 아직 다른 메소드가 작업을 마치지 않은 상태라면 프로그램은 종료되지 않음
    }
}
