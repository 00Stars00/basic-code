package com.starry.studentsystem;

import java.util.Scanner;

public class StudentSystem {
    public static void main(String[] args) {
        while (true) {
            System.out.println("-----------------欢迎来到星空学生管理系统-----------------");
            System.out.println("1.添加学生");
            System.out.println("2.删除学生");
            System.out.println("3.修改学生");
            System.out.println("4.查看所有学生");
            System.out.println("5.退出");
            System.out.println("请输入你的选择：");

            Scanner scanner = new Scanner(System.in);
            String choice = scanner.next();
            switch (choice) {
                case "1" -> addStudent();
                case "2" -> deleteStudent();
                case "3" -> updateStudent();
                case "4" -> findAllStudent();
                case "5" -> System.exit(0);
                default -> System.out.println("输入有误，请重新输入");
            }
        }
    }

    public static void addStudent() {
        System.out.println("添加学生");
    }

    public static void deleteStudent() {
        System.out.println("删除学生");
    }

    public static void updateStudent() {
        System.out.println("修改学生");
    }

    public static void findAllStudent() {
        System.out.println("查看所有学生");
    }
}
