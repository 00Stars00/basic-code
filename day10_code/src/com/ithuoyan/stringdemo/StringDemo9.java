package com.ithuoyan.stringdemo;

import java.util.Scanner;

public class StringDemo9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int money;
        do {
            System.out.println("请输入一个金额：");
            money = scanner.nextInt();
            if ((money < 0 || money >= 10000000)) {
                System.out.println("输入的金额不合法");
            }
        } while (money < 0 || money >= 10000000);
        System.out.println("输入的金额是：" + money);

        String moneyStr = "";
        while (true) {
            int number = money % 10;
            String capitalNumber = getCapitalNumber(number);
            moneyStr = capitalNumber + moneyStr;
            money = money / 10;
            if (money == 0) {
                break;
            }
        }
        int count = 7-moneyStr.length();
        for (int i = 0; i < count; i++) {
            moneyStr = "零" + moneyStr;
        }


        String[] units = {"佰", "拾", "万", "仟", "佰", "拾", "元"};

        String result = "";
        for (int i = 0; i < moneyStr.length(); i++) {
            result += moneyStr.charAt(i) + units[i];
        }
        System.out.println("转换后的金额是：" + result);
    }

    public static String getCapitalNumber(int number) {
        String[] capitalNumber = {"零", "壹", "贰", "叁", "肆", "伍", "陆", "柒", "捌", "玖"};
        return capitalNumber[number];
    }

}
