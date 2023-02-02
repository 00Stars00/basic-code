package com.stars.test;

import java.util.Random;

public class Test4 {
    public static void main(String[] args) {
        while (true) {
            System.out.println(randomPath(13, "animal"));

        }
    }

    private static String randomPath(int num, String name) {
        String path;
        Random random = new Random();
        path = "puzzle-game/image/" + name + "/" + name + (random.nextInt(num) + 1) ;
        return path;
    }
}
