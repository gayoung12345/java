package com.example.modifier;

import java.text.SimpleDateFormat;
import java.util.Date;

class Count {
    int a = 0;
    static int b = 0; // 멤버변수를 static으로 선언(여러 객체가 공유하는 변수)
}

class Util {
    public static String getCurrentDate(String format) {
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        return sdf.format(new Date());
    }
}

public class StaticMain {
    public static void main(String[] args) {
        Count c1 = new Count();
        c1.a++;
        c1.b++; // static
        System.out.println("c1.a = " + c1.a + ", c1.b = " + c1.b);  // >> 1, 1

        Count c2 = new Count();
        c2.a++;
        c2.b++; // static 공유변수
        System.out.println("c2.a = " + c2.a + ", c2.b = " + c2.b);  // >> 1, 2

        Count.b++;  // 인스턴스객체를 생성하지 않고, 클래스명.static변수명 으로 사용 가능
        System.out.println("c2.b = " + c2.b);

        // method()가 static으로 선언되면 클래스명.static메소드명()으로 사용 가능
        Math.random(); // Math class의 random()은 static method이다. (매개변수 없음)
        int c = Integer.parseInt("123"); // Integer class의 parseInt()는 static method이다. (매개변수 있음: String s)

        // Util class의 getCurrentDate()는 static method이다.(매개변수 있음: String format)
        System.out.println(Util.getCurrentDate("yyyy-MM-dd"));  // 날짜 출력
        System.out.println(Util2.getCurrentDate("yyyy-MM-dd"));

    }

}
