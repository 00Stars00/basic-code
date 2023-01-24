package com.ithuoyan.test;

import java.util.ArrayList;

public class Test7 {
    public static void main(String[] args) {
        ArrayList<User> list = new ArrayList<>();

        User user1 = new User("1", "admin1","123456");
        User user2 = new User("2", "admin2","123456");
        User user3 = new User("3", "admin3","123456");

        list.add(user1);
        list.add(user2);
        list.add(user3);

        int index = getIndex(list, "2");
        System.out.println(index);
    }


    public static int getIndex(ArrayList<User> list, String id) {
        for (int i = 0; i < list.size(); i++) {
            User user = list.get(i);
            if (user.getId().equals(id)) {
                return i;
            }
        }
        return -1;
    }

}
