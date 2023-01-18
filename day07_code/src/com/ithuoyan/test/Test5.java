package com.ithuoyan.test;

import java.util.Random;

public class Test5 {
    public static void main(String[] args) {
        int[] scoresArr = getScores();
        int max = getMax(scoresArr);
        int min = getMin(scoresArr);
        int sum = getSum(scoresArr);
        int avg = (sum - max - min) / (scoresArr.length - 2);
        System.out.println("选手的最终得分是："+avg);
    }

    public static int[] getScores(){
        int[] scores = new int[6];
        Random random = new Random();
        for (int i = 0; i < scores.length; i++) {
            System.out.println("请输入评委的打分");
            int score = random.nextInt(0,101);
            System.out.println(score);
            scores[i]=score;
        }
        return scores;
    }

    public static int getMax(int[] scoreArr){
        int max=scoreArr[0];
        for (int j : scoreArr) {
            if (j > max) {
                max = j;
            }
        }
        return max;
    }

    public static int getMin(int[] scoreArr){
        int min=scoreArr[0];
        for (int j : scoreArr) {
            if (j < min) {
                min = j;
            }
        }
        return min;
    }

    public static int getSum(int[] scoreArr) {
        int sum=0;
        for (int j : scoreArr) {
            sum += j;
        }
        return sum;
    }

}
