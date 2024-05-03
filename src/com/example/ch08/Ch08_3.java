package com.example.ch08;

public class Ch08_3 {
    static int getTotalPage(int m, int n) { // 총 페이지 수를 반환
        // m: 게시물의 총 개수 / n: 한 페이지에 보여 줄 게시물의 개수
        if (m % n == 0){
            return n / m;
        } else {
            return m / n + 1;
        }
    }
    public static void main(String[] args) {
        System.out.println(getTotalPage(1, 10));
    }
}
