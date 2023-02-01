package com.stars.a04polymorphismdemo4;

public class Test {
    public static void main(String[] args) {
        /*Person p1 = new Person("老王", 18);
        Dog dog = new Dog(2,"黑");
        p1.keepPet(dog,"骨头");


        Person p2 = new Person("老李", 20);
        Cat cat = new Cat(1,"白");
        p2.keepPet(cat,"鱼");*/


        Person p1 = new Person("老王", 18);
        Dog dog = new Dog(2,"黑");
        Cat cat = new Cat(1,"白");
        p1.keepPet(dog,"骨头");
        p1.keepPet(cat,"鱼");
    }


}
