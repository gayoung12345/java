package com.example.codingproblem.q8;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class FileAverageMain {
    public static void main(String[] args) throws IOException {
        ArrayList<String> lines = new ArrayList<>();

        BufferedReader br = new BufferedReader(new FileReader("C:\\java\\ch07\\src\\com\\example\\codingproblem\\q8\\sample.txt"));
        while (true) {
            String line = br.readLine();
            if(line == null) break;
            lines.add(line);
        }
        br.close();

        int total = 0;
        for (String line : lines) {
            line = line.trim(); // 공백제거
            total += Integer.parseInt(line);    // 문자열을 숫자로 변환
        }
        double average = (double) total / lines.size();
        System.out.println("총합: " + total + ", 평균: " + average);

        PrintWriter pw = new PrintWriter("C:\\java\\ch07\\src\\com\\example\\codingproblem\\q8\\result.txt");
        pw.println(String.format("%.2f", average));
        pw.close();
    }
}
