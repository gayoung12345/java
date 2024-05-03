package com.example.codingproblem.q2;

import java.util.HashMap;

public class Sample {
    public static void main(String[] args) {
        HashMap<String, Integer> a = new HashMap<>();
        a.put("A", 90);
        a.put("B", 80);

        System.out.println(a.getOrDefault("C",70));
        // getOrDefault(값을 가지고 올 키 이름, 지정된 키에 매핑된(저장한) 값이 없으면 반환되어야하는 기본 값)
        // 찾는 키에 값이 있으면 그 값을 반환하고, 없으면 기본 값을 반환하는 메소드
    }
}
