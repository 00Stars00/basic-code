package com.starry.studentsystem;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentSystem {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        while (true) {
            System.out.println("-----------------欢迎来到星空学生管理系统-----------------");
            System.out.println("1.添加学生");
            System.out.println("2.删除学生");
            System.out.println("3.修改学生");
            System.out.println("4.查看所有学生");
            System.out.println("5.退出");
            System.out.println("------------------------------------------------------");
            System.out.println("请输入你的选择：");

            Scanner scanner = new Scanner(System.in);
            String choice = scanner.next();
            switch (choice) {
                case "1" -> addStudent(students);
                case "2" -> deleteStudent(students);
                case "3" -> updateStudent(students);
                case "4" -> findAllStudent(students);
                case "5" -> System.exit(0);
                default -> System.out.println("输入有误，请重新输入");
            }
        }
    }

    public static void addStudent(ArrayList<Student> students) {
        Scanner scanner = new Scanner(System.in);
        String id;
        while (true) {
            System.out.println("请输入学号：");
            id = scanner.next();
            boolean flag = isUsed(students, id);
            if (flag) {
                System.out.println("该学号已被使用，请重新输入");
            } else {
                break;
            }
        }

        System.out.println("请输入姓名：");
        String name = scanner.next();
        System.out.println("请输入年龄：");
        int age = scanner.nextInt();
        System.out.println("请输入住址：");
        String address = scanner.next();

        Student student = new Student(id, name, age, address);
        students.add(student);
        System.out.println("添加学生成功");
    }

    private static boolean isUsed(ArrayList<Student> students, String id) {
        boolean flag = false;
        for (Student student : students) {
            if (student.getId().equals(id)) {
                flag = true;
                break;
            }
        }
        return flag;
    }

    public static void deleteStudent(ArrayList<Student> students) {
        System.out.println("删除学生");
    }

    public static void updateStudent(ArrayList<Student> students) {
        System.out.println("修改学生");
    }

    public static void findAllStudent(ArrayList<Student> students) {
        if (students.size() == 0) {
            System.out.println("当前无学生信息，请先添加信息后再查询");
            return;
        }

        System.out.println("学号\t\t姓名\t\t年龄\t\t住址");
        for (Student student : students) {
            System.out.println(student.getId() + "\t\t" + student.getName() + "\t\t" + student.getAge() + "\t\t" + student.getAddress());
        }
    }
}
