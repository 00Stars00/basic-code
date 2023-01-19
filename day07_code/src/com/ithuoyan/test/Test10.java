package com.ithuoyan.test;

import java.util.Random;

public class Test10 {
    public static void main(String[] args) {
        int[] arr = {2, 588, 888, 1000, 10000};
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            int randomIndex = random.nextInt(arr.length);
            int temp = arr[i];
            arr[i] = arr[randomIndex];
            arr[randomIndex] = temp;
        }
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
