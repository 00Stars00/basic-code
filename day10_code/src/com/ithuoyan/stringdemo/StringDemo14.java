package com.ithuoyan.stringdemo;

import java.util.Scanner;

public class StringDemo14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string;
        while (true) {
            System.out.println("请输入一个字符串：");
            string = scanner.nextLine();
            if(checkStr(string)) {
                break;
            } else {
                System.out.println("当前的字符不符合规则，请重新输入！");
                continue;
            }
        }

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);
            int number = c - '0';
            stringBuilder.append(changeLuoMa(number));
        }
        System.out.println(stringBuilder.toString());

    }


    // changeLuoMa
    public static String changeLuoMa(int number) {
        String[] arr = {" ","I","II","III","IV","V","VI","VII","VIII","IX","X"};
        return arr[number];
    }

    //checkStr
    public static boolean checkStr(String str) {
        if(str.length()>9) {
            return false;
        }

        char[] chars = str.toCharArray();
        for (char aChar : chars) {
            if (aChar < '0' || aChar > '9') {
                return false;
            }
        }
        return true;
    }

}
