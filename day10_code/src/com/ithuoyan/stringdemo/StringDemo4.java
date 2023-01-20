package com.ithuoyan.stringdemo;

import java.util.Scanner;

public class StringDemo4 {
    public static void main(String[] args) {
        // 1.定义两个变量，记录正确的用户名和密码
        String rightUsername = "admin";
        String rightPassword = "123456";

        for (int i = 0; i < 3; i++) {
            // 2.定义两个变量，记录用户输入的用户名和密码
            Scanner scanner = new Scanner(System.in);
            System.out.println("请输入用户名：");
            String username = scanner.next();
            System.out.println("请输入密码：");
            String password = scanner.next();
            // 3.判断用户名和密码是否正确
            if (rightUsername.equals(username) && rightPassword.equals(password)) {
                System.out.println("登录成功");
                break;
            } else {
                if (i == 2) {
                    System.out.println("登录失败");
                } else {
                    System.out.println("登录失败，还有" + (2 - i) + "次机会");
                }
            }
        }
    }
}
