package com.ithuoyan.stringdemo;

import java.util.Scanner;

public class StringDemo5 {
    public static void main(String[] args) {
        // 1.键盘录入一个字符串
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String line = scanner.nextLine();
        // 2.进行遍历
        for (int i = 0; i < line.length(); i++) {
            // 3.获取每一个字符
            char ch = line.charAt(i);
            System.out.println(ch);
        }
    }
}
