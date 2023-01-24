package com.starry.studentsystem;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 学生管理系统
 */
public class App {
    /**
     * 主方法
     *
     * @param args 参数
     */
    public static void main(String[] args) {
        ArrayList<User> users = new ArrayList<>();
        while (true) {
            System.out.println("-----------------欢迎来到星空学生管理系统-----------------");
            System.out.println("1.登录");
            System.out.println("2.注册");
            System.out.println("3.忘记密码");
            System.out.println("4.退出");
            System.out.println("------------------------------------------------------");
            System.out.println("请选择操作：");
            Scanner scanner = new Scanner(System.in);
            String choice = scanner.next();
            switch (choice) {
                case "1" -> login(users);
                case "2" -> register(users);
                case "3" -> forgetPassword(users);
                case "4" -> System.exit(0);
                default -> System.out.println("输入有误，请重新输入");
            }
        }
    }


    private static void forgetPassword(ArrayList<User> users) {

    }

    /**
     * 注册
     */
    private static void register(ArrayList<User> users) {
        Scanner scanner = new Scanner(System.in);
        String username;
        while (true) {
            System.out.println("请输入用户名：");
            username = scanner.next();

            if (!checkUsername(username)) {
                System.out.println("用户名不合法");
                continue;
            }

            if (contains(users, username)) {
                System.out.println("用户名" + username + "已存在,请重新输入");
            } else {
                System.out.println("用户名" + username + "可用");
                break;
            }
        }

        String password;
        while (true) {
            System.out.println("请输入密码：");
            password = scanner.next();
            System.out.println("请再次输入密码：");
            String againPassword = scanner.next();
            if (!password.equals(againPassword)) {
                System.out.println("两次输入的密码不一致,请重新输入");
                continue;
            } else {
                System.out.println("密码设置成功");
                break;
            }
        }

        String personID;
        while (true) {
            System.out.println("请输入身份证号：");
            personID = scanner.next();
            if (!checkPersonID(personID)) {
                System.out.println("身份证号不合法");
                continue;
            } else {
                System.out.println("身份证号合法");
                break;
            }

        }

        String phoneNumber;
        while (true) {
            System.out.println("请输入手机号码：");
            phoneNumber = scanner.next();
            if (!checkPhoneNumber(phoneNumber)) {
                System.out.println("手机号码不合法");
                continue;
            } else {
                System.out.println("手机号码合法");
                break;
            }
        }

        User user = new User(username, password, personID, phoneNumber);
        users.add(user);
        System.out.println("注册成功");

        printUsers(users);

    }


    private static void printUsers(ArrayList<User> users) {
        for (User user : users) {
            System.out.println("用户名：" + user.getUsername());
            System.out.println("密码：" + user.getPassword());
            System.out.println("身份证号：" + user.getPersonID());
            System.out.println("手机号码：" + user.getPhoneNumber());
        }
    }

    private static boolean checkPhoneNumber(String phoneNumber) {
        int length = phoneNumber.length();
        if (length != 11) {
            return false;
        }
        if (phoneNumber.startsWith("0")) {
            return false;
        }
        for (int i = 0; i < phoneNumber.length(); i++) {
            char c = phoneNumber.charAt(i);
            if (!(c >= '0' && c <= '9')) {
                return false;
            }
        }
        return true;
    }

    private static boolean checkPersonID(String personID) {
        int length = personID.length();
        if (length != 18) {
            return false;
        }

        if (personID.startsWith("0")) {
            return false;
        }

        for (int i = 0; i < personID.length() - 1; i++) {
            char c = personID.charAt(i);
            if (!(c >= '0' && c <= '9')) {
                return false;
            }
        }

        return personID.charAt(17) == 'X' || personID.charAt(17) == 'x' || (personID.charAt(17) >= '0' && personID.charAt(17) <= '9');
    }

    private static boolean contains(ArrayList<User> users, String username) {
        for (User user : users) {
            if (user.getUsername().equals(username)) {
                return true;
            }
        }
        return false;
    }

    private static boolean checkUsername(String username) {

        int length = username.length();
        if (length < 3 || length > 15) {
            return false;
        }

        for (int i = 0; i < username.length(); i++) {
            char c = username.charAt(i);
            if (!((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9'))) {
                return false;
            }
        }

        int count = 0;
        for (int i = 0; i < username.length(); i++) {
            char c = username.charAt(i);
            if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
                count++;
                break;
            }
        }
        return count >= 1;
    }


    private static void login(ArrayList<User> users) {

    }
}
