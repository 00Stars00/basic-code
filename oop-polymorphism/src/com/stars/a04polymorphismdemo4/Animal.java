package com.stars.a04polymorphismdemo4;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Animal {
    private int age;
    private String color;

    public void eat(String something) {
        System.out.println("动物在吃"+something);
    }

}
