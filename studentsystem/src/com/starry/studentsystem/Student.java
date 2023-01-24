package com.starry.studentsystem;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 学生类
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Student {
    /**
     * 学号
     */
    private String id;
    /**
     * 姓名
     */
    private String name;
    /**
     * 年龄
     */
    private int age;
    /**
     * 地址
     */
    private String address;


}
