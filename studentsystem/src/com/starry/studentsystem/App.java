package com.starry.studentsystem;

import java.util.ArrayList;
import java.util.Random;
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


    /**
     * 重置密码
     * @param users 用户集合
     */
    private static void forgetPassword(ArrayList<User> users) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入用户名：");
        String username = scanner.next();
        if (!contains(users, username)) {
            System.out.println("用户名" + username + "不存在");
            return;
        }

        System.out.println("请输入身份证号：");
        String personID = scanner.next();
        System.out.println("请输入手机号：");
        String phoneNumber = scanner.next();

        int index = findIndex(users, username);
        User user = users.get(index);
        if (!(user.getPersonID().equalsIgnoreCase(personID) && user.getPhoneNumber().equals(phoneNumber))) {
            System.out.println("身份证号或手机号不正确");
            return;
        }

        while (true) {
            System.out.println("请输入新密码：");
            String password = scanner.next();
            System.out.println("请再次输入新密码：");
            String againPassword = scanner.next();
            if (!password.equals(againPassword)) {
                System.out.println("两次输入的密码不一致,请重新输入");
                continue;
            } else {
                user.setPassword(password);
                System.out.println("密码修改成功");
                break;
            }
        }

    }

    /**
     * 获取用户名在集合中的索引
     * @param users 用户集合
     * @param username 用户名
     * @return 用户名在集合中的索引
     */
    private static int findIndex(ArrayList<User> users, String username) {
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getUsername().equals(username)) {
                return i;
            }
        }
        return -1;
    }

    /**
     * 注册
     *
     * @param users 用户集合
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

    /**
     * 打印用户信息
     *
     * @param users 用户集合
     */
    private static void printUsers(ArrayList<User> users) {
        for (User user : users) {
            System.out.println("用户名：" + user.getUsername());
            System.out.println("密码：" + user.getPassword());
            System.out.println("身份证号：" + user.getPersonID());
            System.out.println("手机号码：" + user.getPhoneNumber());
        }
    }

    /**
     * 判断手机号码是否合法
     *
     * @param phoneNumber 手机号码
     * @return 是否合法
     */
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

    /**
     * 判断身份证号是否合法
     *
     * @param personID 身份证号
     * @return 是否合法
     */
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

    /**
     * 判断用户名是否存在
     *
     * @param users    用户集合
     * @param username 用户名
     * @return 是否存在
     */
    private static boolean contains(ArrayList<User> users, String username) {
        for (User user : users) {
            if (user.getUsername().equals(username)) {
                return true;
            }
        }
        return false;
    }

    /**
     * 判断用户名是否合法
     *
     * @param username 用户名
     * @return 是否合法
     */
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

    /**
     * 登录
     *
     * @param users 用户集合
     */
    private static void login(ArrayList<User> users) {
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        while (true) {
            System.out.println("请输入用户名：");
            String username = scanner.next();
            if (!contains(users, username)) {
                System.out.println("用户名" + username + "不存在,请先注册再登录");
                return;
            }
            System.out.println("请输入密码：");
            String password = scanner.next();

            while (true) {
                System.out.println("请输入验证码：");
                String code = getCode();
                System.out.println("验证码：" + code);
                String inputCode = scanner.next();
                if (!code.equalsIgnoreCase(inputCode)) {
                    System.out.println("验证码错误");
                    continue;
                } else {
                    System.out.println("验证码正确");
                    break;
                }
            }

            User userInfo = new User(username, password, null, null);
            if (checkUserInfo(users, userInfo)) {
                System.out.println("登录成功");
                break;
            } else {
                if (count == 2) {
                    System.out.println("登录失败次数过多，程序退出");
                    return;
                } else {
                    System.out.println("登录失败,用户名或密码错误,还有" + (2 - count) + "次机会");
                }
            }
            count++;
        }


    }

    /**
     * 判断用户信息是否正确
     *
     * @param users    用户集合
     * @param userInfo 用户信息
     * @return 是否正确
     */
    private static boolean checkUserInfo(ArrayList<User> users, User userInfo) {
        for (User user : users) {
            if (user.getUsername().equals(userInfo.getUsername()) && user.getPassword().equals(userInfo.getPassword())) {
                return true;
            }
        }
        return false;
    }

    /**
     * 形成验证码
     *
     * @return 验证码
     */
    private static String getCode() {
        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            list.add((char) ('a' + i));
            list.add((char) ('A' + i));
        }

        StringBuilder stringBuilder = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < 4; i++) {
            int index = random.nextInt(list.size());
            char c = list.get(index);
            stringBuilder.append(c);
        }

        int number = random.nextInt(10);
        stringBuilder.append(number);

        char[] chars = stringBuilder.toString().toCharArray();
        for (int i = 0; i < chars.length; i++) {
            int index = random.nextInt(chars.length);
            char temp = chars[i];
            chars[i] = chars[index];
            chars[index] = temp;
        }

        return new String(chars);
    }
}
