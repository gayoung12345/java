package com.example.codingproblem.q13;

import java.util.ArrayList;

public class ChkDupNumMain {
    static boolean checkDupNum(String data) {
        ArrayList<String> result = new ArrayList<>();
        for (String s : data.split("")) {
            if(result.contains(s)){
                return false;   // 중복 숫자가 있으면 false
            } else {
                result.add(s);
            }
        }
        return result.size() == 10;
    }
    public static void main(String[] args) {
        System.out.println(checkDupNum("0123456789")); // true
        System.out.println(checkDupNum("01234"));   // false
        System.out.println(checkDupNum("01234567890")); // false
        System.out.println(checkDupNum("6789012345"));  // true
        System.out.println(checkDupNum("012322456789"));    // false
    }
}
