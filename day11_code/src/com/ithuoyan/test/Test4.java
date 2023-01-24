package com.ithuoyan.test;

import java.util.ArrayList;
import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 4; i++) {
            System.out.println("请输入学生的姓名：");
            String name = sc.next();
            System.out.println("请输入学生的年龄：");
            int age = sc.nextInt();
            Student student = new Student(name, age);
            list.add(student);
        }

        for (Student student : list) {
            System.out.println(student.getName() + " " + student.getAge());
        }
    }
}
