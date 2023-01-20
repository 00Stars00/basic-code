package com.ithuoyan.stringdemo;

public class StringDemo11 {
    public static void main(String[] args) {
        String id = "110101199001011234";
        String year = id.substring(6, 10);
        String month = id.substring(10, 12);
        String day = id.substring(12, 14);
        String gender = id.substring(16, 17);
        String result = year + "年" + month + "月" + day + "日";
        if (Integer.parseInt(gender) % 2 == 0) {
            gender = "女";
        } else {
            gender = "男";
        }
        System.out.println("人物信息为：");
        System.out.println("出生年月日："+result);
        System.out.println("性别为："+gender);
    }
}
