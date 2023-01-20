package com.ithuoyan.stringdemo;

import java.util.Scanner;

public class StringDemo6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String line = scanner.nextLine();

        int bigCount = 0;
        int smallCount = 0;
        int numberCount = 0;
        int otherCount = 0;
        for (int i = 0; i < line.length(); i++) {
            char ch = line.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                bigCount++;
            } else if (ch >= 'a' && ch <= 'z') {
                smallCount++;
            } else if (ch >= '0' && ch <= '9') {
                numberCount++;
            } else {
                otherCount++;
            }
        }
        System.out.println("大写字母个数：" + bigCount);
        System.out.println("小写字母个数：" + smallCount);
        System.out.println("数字个数：" + numberCount);
        System.out.println("其他字符个数：" + otherCount);
    }
}
