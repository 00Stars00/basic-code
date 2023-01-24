package com.ithuoyan.test;

import java.util.ArrayList;

public class Test3 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();

        list.add(new Student("张三", 18));
        list.add(new Student("李四", 19));
        list.add(new Student("王五", 20));
        list.add(new Student("赵六", 21));
        list.add(new Student("田七", 22));

        for (Student stu : list) {
            System.out.println(stu.getName() + ", " + stu.getAge());
        }
    }
}
