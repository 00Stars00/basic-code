package com.stars.a04polymorphismdemo4;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Person {
    private String name;
    private int age;


    /*public void keepPet(Dog dog,String something) {
        System.out.println("年龄为"+this.age+"岁的"+this.name+
                "养了一只"+dog.getColor()+"颜色的"+dog.getAge()+"岁的狗");
        dog.eat(something);
    }

    public void keepPet(Cat cat,String something) {
        System.out.println("年龄为"+this.age+"岁的"+this.name+
                "养了一只"+cat.getColor()+"颜色的"+cat.getAge()+"岁的猫");
        cat.eat(something);
    }*/

    public void keepPet(Animal animal,String something) {
        if(animal instanceof Dog dog) {
            System.out.println("年龄为"+this.age+"岁的"+this.name+
                    "养了一只"+dog.getColor()+"颜色的"+dog.getAge()+"岁的狗");
            dog.eat(something);
        } else if(animal instanceof Cat cat) {
            System.out.println("年龄为"+this.age+"岁的"+this.name+
                    "养了一只"+cat.getColor()+"颜色的"+cat.getAge()+"岁的猫");
            cat.eat(something);
        }
    }
}
