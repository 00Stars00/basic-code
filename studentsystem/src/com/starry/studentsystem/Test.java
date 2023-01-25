package com.starry.studentsystem;

import java.util.ArrayList;
import java.util.Random;

public class Test {
    public static void main(String[] args) {
        System.out.println(getCode());
    }
    private static String getCode() {
        ArrayList<Character> list = new ArrayList<Character>();
        for (int i = 0; i < 26; i++) {
            list.add((char) ('a' + i));
            list.add((char) ('A' + i));
        }

        StringBuilder stringBuilder = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < 4; i++) {
            int index = random.nextInt(list.size());
            char c = list.get(index);
            stringBuilder.append(c);
        }

        int number = random.nextInt(10);
        stringBuilder.append(number);

        char[] chars = stringBuilder.toString().toCharArray();
        for (int i = 0; i < chars.length; i++) {
            int index = random.nextInt(chars.length);
            char temp = chars[i];
            chars[i] = chars[index];
            chars[index] = temp;
        }

        return new String(chars);
    }
}
