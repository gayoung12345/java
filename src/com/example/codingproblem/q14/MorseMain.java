package com.example.codingproblem.q14;

import java.util.HashMap;

public class MorseMain {
    // 모스 부호 규칙을 해시맵으로 정의
    private static final HashMap<String, Character> morseCodeMap = new HashMap<>();
    static {
        morseCodeMap.put(".-", 'A');
        morseCodeMap.put("-...", 'B');
        morseCodeMap.put("-.-.", 'C');
        morseCodeMap.put("-..", 'D');
        morseCodeMap.put(".", 'E');
        morseCodeMap.put("..-.", 'F');
        morseCodeMap.put("--.", 'G');
        morseCodeMap.put("....", 'H');
        morseCodeMap.put("..", 'I');
        morseCodeMap.put(".---", 'J');
        morseCodeMap.put("-.-", 'K');
        morseCodeMap.put(".-..", 'L');
        morseCodeMap.put("--", 'M');
        morseCodeMap.put("-.", 'N');
        morseCodeMap.put("---", 'O');
        morseCodeMap.put(".--.", 'P');
        morseCodeMap.put("--.-", 'Q');
        morseCodeMap.put(".-.", 'R');
        morseCodeMap.put("...", 'S');
        morseCodeMap.put("-", 'T');
        morseCodeMap.put("..-", 'U');
        morseCodeMap.put("...-", 'V');
        morseCodeMap.put(".--", 'W');
        morseCodeMap.put("-..-", 'X');
        morseCodeMap.put("-.--", 'Y');
        morseCodeMap.put("--..", 'Z');
        morseCodeMap.put("-----", '0');
        morseCodeMap.put(".----", '1');
        morseCodeMap.put("..---", '2');
        morseCodeMap.put("...--", '3');
        morseCodeMap.put("....-", '4');
        morseCodeMap.put(".....", '5');
        morseCodeMap.put("-....", '6');
        morseCodeMap.put("--...", '7');
        morseCodeMap.put("---..", '8');
        morseCodeMap.put("----.", '9');
        morseCodeMap.put("", ' '); // 공백
    }

    public static String decode(String morseCode) {
        StringBuilder decodedString = new StringBuilder();
        String[] words = morseCode.split(" "); // 모스 부호를 공백으로 분리하여 단어로 나눔

        for (String word : words) {
            Character decodedChar = morseCodeMap.get(word); // 모스 부호를 알파벳으로 변환
            if (decodedChar != null) {
                decodedString.append(decodedChar); // 변환된 알파벳 추가
            } else {
                decodedString.append("?"); // 알파벳으로 변환할 수 없는 경우 '?' 추가
            }
        }

        return decodedString.toString();
    }

    public static void main(String[] args) {
        String morseCode = "- .... .  --.- ..- .. -.-. -.-  -... .-. --- .-- -.  ..-. --- -..-  .--- ..- -- .--. ...  --- ...- . .-.  - .... .  .-.. .- --.. -.--  -.. --- --."; // 예시 모스 부호
        String decodedString = decode(morseCode);
        System.out.println("Decoded string: " + decodedString);
    }
}
