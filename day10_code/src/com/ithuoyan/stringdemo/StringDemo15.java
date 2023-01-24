package com.ithuoyan.stringdemo;

public class StringDemo15 {
    public static void main(String[] args) {
        String strA = "abcde";
        String strB = "abc";

        boolean result = check(strA, strB);
        System.out.println(result);


    }


    public static boolean check(String strA, String strB) {
        if (strA.length() != strB.length()) {
            return false;
        }
        for (int i = 0; i < strA.length(); i++) {
            strA = rotate(strA);
            if (strA.equals(strB)) {
                return true;
            }
        }
        return false;
    }

    public static String rotate(String str) {
        String strA = str.substring(0, 1);
        String strB = str.substring(1);
        return strB + strA;
    }

}
