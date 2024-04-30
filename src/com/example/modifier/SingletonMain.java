package com.example.modifier;

class Singleton {
    private static Singleton one;
    private Singleton() {   // 생성자
    }
    public static Singleton getInstance() {
        // return new Singleton(); // 같은 클래스이므로, private 생성자 호출 가능
        // private(같은클래스)<default(같은클래스,패키지)<protected(같은클래스,패키지,상속클래스)<public(전부)

        if(one == null) {   // 생성되지 않은 상태일 때만 생성
            one = new Singleton();
        }
        return one;
    }

}

public class SingletonMain {
    public static void main(String[] args) {
//        Singleton singleton = new Singleton(); // Singleton()의 생성자가 private이므로 오류발생
        Singleton s1 = Singleton.getInstance();

        /*
        // singleton pattern(단 하나의 객체만 생성하게 강제하는 디자인 패턴)에 위배되는 행동
        Singleton s2 = Singleton.getInstance();
        Singleton s3 = Singleton.getInstance();
        System.out.println(s1 == s2); // >> false 서로 다른 객체
        */

        Singleton s2 = Singleton.getInstance();
        System.out.println(s1 == s2); // >> true 서로 같은 객체(singleton)

    }
}
