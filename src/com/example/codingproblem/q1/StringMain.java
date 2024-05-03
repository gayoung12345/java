package com.example.codingproblem.q1;

public class StringMain {
    public static void main(String[] args) {
        String s = "a:b:c:d";
        String[] words = s.split(":"); // words[] = {"a","b","c","d"}
        String result = String.join("#", words);
        System.out.println(result);
    }
}
