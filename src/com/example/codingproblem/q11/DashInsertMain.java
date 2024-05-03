package com.example.codingproblem.q11;

import java.util.ArrayList;
import java.util.Arrays;

public class DashInsertMain {
    public static void main(String[] args) {
        String data = "4546793";
        String result = dashInsert(data);
        System.out.println(result);

    }

    static String dashInsert(String data){
        int[] numbers = Arrays.stream(data.split("")).mapToInt(Integer::parseInt).toArray();
        ArrayList<String> resultList = new ArrayList<>();
        for(int i=0; i<numbers.length; i++){
            resultList.add(""+numbers[i]);
            if(i<numbers.length-1){
                boolean isOdd = numbers[i] % 2 == 1;
                boolean isNextOdd = numbers[i+1] % 2 == 1;

                if(isOdd&&isNextOdd){
                    resultList.add("-");
                }else if(!(isOdd||isNextOdd)){
                    resultList.add("*");
                }
            }
        }
            return String.join(" ", resultList);
    }
}
