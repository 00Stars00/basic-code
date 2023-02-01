package com.start.test;

import java.util.Random;

public class Test {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            int index = random.nextInt(arr.length);
            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
        
        int[][] arr2 = new int[4][4];
        for (int i = 0; i < arr.length; i++) {
            arr2[i / 4][i % 4] = arr[i];
        }
        for (int[] ints : arr2) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }
}
