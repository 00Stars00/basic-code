package com.starry.studentsystem;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 学生管理系统
 */
public class StudentSystem {
    /**
     * 主方法
     * @param args 参数
     */
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

    /**
     * 添加学生
     * @param students 学生集合
     */
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

    /**
     * 判断学号是否被使用
     * @param students 学生集合
     * @param id 学号
     * @return true：被使用，false：未被使用
     */
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

    /**
     * 根据学号获取学生在集合中的索引
     * @param students 学生集合
     * @param id 学号
     * @return 学生在集合中的索引，-1表示该学生不存在
     */
    public static int getIndex(ArrayList<Student> students, String id) {
        int index = -1;
        for (int i = 0; i < students.size(); i++) {
            Student student = students.get(i);
            if (student.getId().equals(id)) {
                index = i;
                break;
            }
        }
        return index;
    }

    /**
     * 删除学生
     * @param students 学生集合
     */
    public static void deleteStudent(ArrayList<Student> students) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要删除的学生学号：");
        String id = scanner.next();
        int index = getIndex(students, id);

        if (index == -1) {
            System.out.println("该学生不存在");
        } else {
            students.remove(index);
            System.out.println("删除学生成功");
        }
    }

    /**
     * 修改学生
     * @param students 学生集合
     */
    public static void updateStudent(ArrayList<Student> students) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要修改的学生学号：");
        String id = scanner.next();
        int index = getIndex(students, id);

        if (index == -1) {
            System.out.println("该学生不存在");
        } else {
            System.out.println("请输入新的姓名：");
            String name = scanner.next();
            System.out.println("请输入新的年龄：");
            int age = scanner.nextInt();
            System.out.println("请输入新的住址：");
            String address = scanner.next();

            Student student = new Student(id, name, age, address);
            students.set(index, student);
            System.out.println("修改学生成功");
        }
    }

    /**
     * 查看所有学生
     * @param students 学生集合
     */
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
