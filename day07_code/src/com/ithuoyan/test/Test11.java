package com.ithuoyan.test;

import java.util.Random;
import java.util.Scanner;

public class Test11 {
    public static void main(String[] args) {
        int[] arr = createNumber();
        int[] userInputArr = userInputNumber();
        int redCount = 0;
        int blueCount = 0;
        for (int i = 0; i < userInputArr.length-1; i++) {
            int redNumber = userInputArr[i];
            for (int j = 0; j < arr.length-1; j++) {
                if (redNumber == arr[j]) {
                    redCount++;
                    break;
                }
            }
        }

        if (userInputArr[6] == arr[6]) {
            blueCount++;
        }
        System.out.println("红球中奖个数：" + redCount);
        System.out.println("蓝球中奖个数：" + blueCount);
    }



    public static int[] userInputNumber(){
        int[] arr = new int[7];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 6; i++) {
            System.out.println("请输入第" + (i + 1) + "个红球号码");
            int redNumber = scanner.nextInt();
            if (redNumber>=1 && redNumber<=33){
                boolean flag = contains(arr, redNumber);
                if (flag) {
                    System.out.println("输入的号码重复了");
                    i--;
                }else {
                    arr[i] = redNumber;
                }
            }else {
                System.out.println("输入的红球号码不合法，请重新输入");
                i--;
            }
        }
        while (true) {
            System.out.println("请输入蓝球号码");
            int blueNumber = scanner.nextInt();
            if (blueNumber>=1 && blueNumber<=16) {
                arr[6] = blueNumber;
                break;
            }else {
                System.out.println("输入的蓝球号码不合法，请重新输入");
            }
        }
        return arr;
    }

    public static int[] createNumber(){
        int[] arr = new int[7];
        Random random = new Random();
        for (int i = 0; i < arr.length-1; ) {
            int redNumber = random.nextInt(33) + 1;
            boolean flag = contains(arr, redNumber);
            if (!flag) {
                arr[i] = redNumber;
                i++;
            }
        }
        int blueNumber = random.nextInt(16) + 1;
        arr[arr.length-1] = blueNumber;
        return arr;
    }

    public static boolean contains(int[] arr, int number){
        for (int i : arr) {
            if (i == number) {
                return true;
            }
        }
        return false;
    }
}
