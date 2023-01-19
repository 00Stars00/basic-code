package com.ithuoyan.test;

public class Test12 {
    public static void main(String[] args) {
        int[][] year = {
                {22,66,44},
                {77,33,88},
                {25,45,65},
                {11,66,99}
        };

        int yearSum = 0;
        for (int i = 0; i < year.length; i++) {
            int[] quarter = year[i];
            int sum = getSum(quarter);
            System.out.println("第" + (i+1) + "季度的总销售额为：" + sum);
            yearSum += sum;
        }
        System.out.println("全年的总销售额为：" + yearSum);
    }
    
    public static int getSum(int[] arr){
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }
    
}
