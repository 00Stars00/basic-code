package com.ithuoyan.test8;

public class Test {
    public static void main(String[] args) {

        Student[] students = new Student[3];
        students[0] = new Student(1, "小明", 18);
        students[1] = new Student(2, "小红", 19);
        students[2] = new Student(3, "小花", 20);

        Student student = new Student(4, "小丽", 21);

        //唯一性判断
        boolean flag = contains(students, student);
        if (flag) {
            System.out.println("该学生已存在");
        } else {
            int length = getLength(students);
            if (length == students.length) {
                Student[] newStudents = copy(students);
                newStudents[length] = student;
                print(newStudents);
            } else {
                students[length] = student;
                print(students);
            }
        }

    }

    //打印元素
    public static void print(Student[] students) {
        for (Student student : students) {
            if (student != null) {
                System.out.println(student.getId()+","+student.getName()+","+student.getAge());
            }
        }
    }


    //定义一个方法，创建新数组，将原数组的元素复制到新数组中
    public static Student[] copy(Student[] students) {
        Student[] newStudents = new Student[students.length + 1];
        System.arraycopy(students, 0, newStudents, 0, students.length);
        return newStudents;
    }

    //定义一个方法，判断数组中已经存了几个元素
    public static int getLength(Student[] students) {
        int count = 0;
        for (Student student : students) {
            if (student != null) {
                count++;
            }
        }
        return count;
    }

    public static boolean contains(Student[] students, Student student) {
        for (Student s : students) {
            if (s.getId() == student.getId()) {
                return true;
            }
        }
        return false;
    }

}
