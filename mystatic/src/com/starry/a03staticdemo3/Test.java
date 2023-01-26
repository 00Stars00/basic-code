package com.starry.a03staticdemo3;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();

        Student s1 = new Student("张三", 23, "男");
        Student s2 = new Student("李四", 24, "女");
        Student s3 = new Student("王五", 25, "男");

        list.add(s1);
        list.add(s2);
        list.add(s3);

        int maxAge = StudentUtil.getMaxAgeStudent(list);
        System.out.println("最大年龄：" + maxAge);
    }
}
