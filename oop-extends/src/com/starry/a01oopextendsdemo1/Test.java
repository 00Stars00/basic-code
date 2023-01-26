package com.starry.a01oopextendsdemo1;

public class Test {
    public static void main(String[] args) {
        Ragdoll ragdoll = new Ragdoll();
        ragdoll.eat();
        ragdoll.drink();
        ragdoll.catchMouse();

        Husky husky = new Husky();
        husky.eat();
        husky.drink();
        husky.breakHome();
    }
}
