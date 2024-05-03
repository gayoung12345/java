package com.example.codingproblem.q7;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;

public class FileReverseMain {
    public static void main(String[] args) throws IOException {
        ArrayList<String> lines = new ArrayList<>();    // 읽어온 문자열을 저장할 배열

        // BufferedReader: 파일을 한 줄 단위로 읽어옴
        BufferedReader br = new BufferedReader(new FileReader("C:\\java\\ch07\\src\\com\\example\\codingproblem\\q7\\abc.txt"));
        while (true){
            String line = br.readLine(); // abc.txt에서 1줄을 읽어옴
            if(line == null) break; // 라인이 비어있으면 종료
            lines.add(line);    // 읽어온 줄을 ArrayList에 저장
        }
        br.close();

        lines.sort(Comparator.reverseOrder());  // 역순 정렬

        PrintWriter pw = new PrintWriter("C:\\java\\ch07\\src\\com\\example\\codingproblem\\q7\\result.txt"); // 새로운 텍스트 파일 생성
        for(String line : lines){
            pw.println(line);   // ArrayList에 저장된 문자열을 출력
        }
        pw.close();
    }
}
