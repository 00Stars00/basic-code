package com.ithuoyan.stringdemo;

public class StringDemo7 {
    public static void main(String[] args) {
        int[] arr = new int[3];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;

        String string = arrayToString(arr);
        System.out.println(string);
    }

    public static String arrayToString(int[] arr){
        String s = "[";
        for (int i = 0; i < arr.length; i++) {
            if (i==arr.length-1){
                s+=arr[i];
            } else {
                s+=arr[i]+",";
            }
        }
        s+="]";
        return s;
    }

}
