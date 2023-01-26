package com.starry.a01staticdemo1;

public class StudentTest {
    public static void main(String[] args) {
        Student s1 = new Student("张三", 23, "男");
        Student s2 = new Student("李四", 24, "女");
        Student.teacherName = "张老师";
        s1.study();
        s1.show();
        s2.study();
        s2.show();
    }
}
