package com.ithuoyan.stringdemo;

public class StringDemo12 {
    public static void main(String[] args) {
        String talk= "你玩的真好，以后不要再玩了，TMD，SB";

        String[] arr = {"TMD","CNM","SB","MLB"};

        for (String s : arr) {
            talk = talk.replace(s, "***");
        }
        System.out.println(talk);
    }
}

