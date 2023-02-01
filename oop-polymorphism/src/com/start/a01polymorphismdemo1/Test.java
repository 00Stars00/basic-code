package com.start.a01polymorphismdemo1;

public class Test {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("张三");
        student.setAge(18);


        Teacher teacher = new Teacher();
        teacher.setName("李四");
        teacher.setAge(30);


        Administrator administrator = new Administrator();
        administrator.setName("管理员");
        administrator.setAge(35);


        register(student);
        register(teacher);
        register(administrator);
    }

    public static void register(Person person){
        person.show();
    }
}
