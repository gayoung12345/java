package com.example.thread;

import java.util.ArrayList;

public class SampleRunnable implements Runnable {   // Runnable interface 사용 (다중상속이 불가능하므로)
    int seq;
    public SampleRunnable(int seq) {
        this.seq = seq;
    }

    @Override
    public void run() {
        System.out.println(this.seq + " thread start.");
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
        }
        System.out.println(this.seq + " thread end.");
    }

    public static void main(String[] args) {
        ArrayList<Thread> threads = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(new SampleRunnable(i));
            thread.start();
            threads.add(thread);
        }
        for (int i = 0; i < 10; i++) {
            Thread thread = threads.get(i);
            try {
                thread.join();  // 스레드가 종료할 때 까지 기다림
            } catch (Exception e) {
            }
        }
        System.out.println("main end."); // main 메소드 종료
        // join()을 사용했으므로, 모든 메소드가 작업이 끝나야 메인 메소드가 종료되고 프로그램이 종료된다.
    }
}
