package com.ithuoyan.test;

import java.util.ArrayList;

public class Test6 {
    public static void main(String[] args) {
        ArrayList<User> list = new ArrayList<>();

        User user1 = new User("1", "admin1","123456");
        User user2 = new User("2", "admin2","123456");
        User user3 = new User("3", "admin3","123456");

        list.add(user1);
        list.add(user2);
        list.add(user3);

        System.out.println(contains(list, "4"));
    }


    public static boolean contains( ArrayList<User> list, String id){
        for (User user : list){
            if (user.getId().equals(id)){
                return true;
            }
        }
        return false;
    }

}
