package com.starry.a07oopextendsdemo7;

public class DogTest {
    public static void main(String[] args) {
        Husky husky = new Husky();
        husky.eat();
        husky.drink();
        husky.lookHome();
        husky.breakHome();

        System.out.println("==================================");

        ChineseDog chineseDog = new ChineseDog();
        chineseDog.eat();
        chineseDog.drink();
        chineseDog.lookHome();
    }
}
