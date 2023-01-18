package com.ithuoyan.test;

import java.util.Random;

/**
 * 练习5
 */
public class Test5 {
    public static void main(String[] args) {
        int[] scoresArr = getScores();
        int max = getMax(scoresArr);
        int min = getMin(scoresArr);
        int sum = getSum(scoresArr);
        int avg = (sum - max - min) / (scoresArr.length - 2);
        System.out.println("选手的最终得分是："+avg);
    }

    /**
     * 生成数据
     * @return 评分数组
     */
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

    /**
     * 求最大值
     * @param scoreArr 评分数组
     * @return 最大值
     */
    public static int getMax(int[] scoreArr){
        int max=scoreArr[0];
        for (int j : scoreArr) {
            if (j > max) {
                max = j;
            }
        }
        return max;
    }

    /**
     * 求最小值
     * @param scoreArr 评分数组
     * @return 最小值
     */
    public static int getMin(int[] scoreArr){
        int min=scoreArr[0];
        for (int j : scoreArr) {
            if (j < min) {
                min = j;
            }
        }
        return min;
    }

    /**
     * 求和
     * @param scoreArr 评分数组
     * @return 总和
     */
    public static int getSum(int[] scoreArr) {
        int sum=0;
        for (int j : scoreArr) {
            sum += j;
        }
        return sum;
    }

}
