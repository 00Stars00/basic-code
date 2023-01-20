package com.ithuoyan.test8;

public class Test4 {
    public static void main(String[] args) {
        Student[] students = new Student[3];
        students[0]=new Student(1,"张三",18);
        students[1]=new Student(2,"李四",19);
        students[2]=new Student(3,"王五",20);
        int index = getIndex(students, 2);
        if (index>=0){
            students[index].setAge(students[index].getAge()+1);
        } else {
            System.out.println("没有找到");
        }
        for (Student student : students) {
            System.out.println(student);
        }
    }

    public static int getIndex(Student[] students,int id){
        for (int i = 0; i < students.length; i++) {
            if(students[i].getId()==id){
                return i;
            }
        }
        return -1;
    }

}
