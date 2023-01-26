package com.starry.a01staticdemo1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Student {
    private String name;
    private int age;
    private String gender;
    public static String teacherName;

    public void study(){
        System.out.println(name + "正在学习");
    }

    public void show() {
        System.out.println(name + ","+age + ","+gender+","+teacherName);
    }
}
