package com.example.book.ex.q3;

import java.util.ArrayList;

class HeavyWork implements Runnable {   // thread 사용
    String name;
    HeavyWork(String name) {    // 생성자
        this.name = name;
    }
    @Override
    public void run() {
        work();
    }
    public void work() {
        for(int i = 0; i < 5; i++) {
            try {
                Thread.sleep(100);  // 0.1sec
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.printf("%s done.\n", this.name);
    }
}

public class Sample {
    public static void main(String[] args) throws InterruptedException {
        long start = System.currentTimeMillis();
        ArrayList<Thread> threads = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Thread thread = new Thread(new HeavyWork("Heavy Work " + i));
            threads.add(thread);
            thread.start();
        }
        for (Thread thread : threads) {
            thread.join();
        }
        long end = System.currentTimeMillis();
        System.out.printf("elapsed time: %d ms\n", end - start);
    }
}
