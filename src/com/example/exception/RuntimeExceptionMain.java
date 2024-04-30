package com.example.exception;

public class RuntimeExceptionMain {
    public static void main(String[] args) {
        try {
            makeExceptions();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    // 모든 makeException() 호출
    public static void makeExceptions() {
//        makeException(10);
//        makeException2();
//        makeException3();
//        makeException4();
//        makeException5();
//        makeException6(); // 무한루프
//        makeException7();
        makeException8();
    }

    // ArithmeticException: / by zero
    public static int makeException(int input) {
        int div = input / 0;
        return div;
    }

    // StringIndexOutOfBoundsException: String index out of range: 1
    public static void makeException2() {
        String a = "a";
        System.out.println(a.charAt(1));
    }

    // ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
    public static void makeException3() {
        int [] a = {1,2,3,4,5};
        System.out.println(a[5]);
    }

    // NullPointerException: Cannot invoke "String.split(String)" because "nothing" is null
    public static void makeException4() {
        String nothing = null;
        System.out.println(nothing.split(""));
    }

    // NumberFormatException: For input string: "abc"
    public static void makeException5() {
        String str = "abc";
        int a = Integer.parseInt(str);
    }

    // StackOverflowError:
    // at com.example.exception.RuntimeExceptionMain.makeException6(RuntimeExceptionMain.java:46)
    public static void makeException6() {
        for(int i = 0; i<Integer.MAX_VALUE; i++) {
            makeException6();
        }
    }

    // ArrayStoreException: java.lang.Integer
    public static void makeException7() {
        Object[] objArr = new String[2];
        objArr[0] = 0;
    }

    // ClassCastException: class java.lang.String cannot be cast to class java.lang.Integer
    // (java.lang.String and java.lang.Integer are in module java.base of loader 'bootstrap')
    public static void makeException8() {
        Object[] objArr = new String[2];
        objArr[0] = "abc";
        Integer i = (Integer)objArr[0];
    }
}
