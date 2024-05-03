package com.example.codingproblem.q15;

import java.util.ArrayList;

public class CaesarMain {
    static String caesar(String word, int n){
        String A = "ABCDRFGHIJKLMNOPQRSTUVWXYZ";
        ArrayList<String> result = new ArrayList<>();
        for(String s : word.split("")){
            int pos = A.indexOf(s);
            int newPos = pos + n;
            newPos = newPos % A.length();
            result.add(A.substring(newPos, newPos+1));
        }
        return String.join(" ", result);
    }
    public static void main(String[] args) {
        System.out.println(caesar("CAT",5));
        System.out.println(caesar("XYZ",3));
    }
}
