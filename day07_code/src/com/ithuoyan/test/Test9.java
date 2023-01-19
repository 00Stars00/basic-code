package com.ithuoyan.test;

import java.util.Random;

public class Test9 {
    public static void main(String[] args) {
        int[] arr = {2,588,888,1000,10000};
        int[] newArr = new int[arr.length];
        Random random = new Random();
        for (int i = 0; i < 5; ) {
            int randomIndex = random.nextInt(arr.length);
            int prize = arr[randomIndex];
            if (!contains(newArr, prize)) {
                newArr[i]= prize;
                i++;
            }
        }
        for (int i : newArr) {
            System.out.println(i);
        }
    }

    public static boolean contains(int[] arr, int prize) {
        for (int i : arr) {
            if (i == prize) {
                return true;
            }
        }
        return false;
    }

}
