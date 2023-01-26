package com.starry.a03staticdemo3;

import java.util.ArrayList;

public class StudentUtil {
    private StudentUtil() {}

    public static int getMaxAgeStudent(ArrayList<Student> list) {
        int maxAge = 0;
        for (Student s : list) {
            if (s.getAge() > maxAge) {
                maxAge = s.getAge();
            }
        }
        return maxAge;
    }
}
