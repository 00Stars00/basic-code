package com.ithuoyan.test;

import java.util.ArrayList;

public class Test8 {
    public static void main(String[] args) {
        ArrayList<Phone> list = new ArrayList<>();

        Phone p1 = new Phone("Apple", 8888);
        Phone p2 = new Phone("Huawei", 6666);
        Phone p3 = new Phone("Xiaomi", 2999);

        list.add(p1);
        list.add(p2);
        list.add(p3);

        ArrayList<Phone> phoneInfo = getPhoneInfo(list);

        for (Phone p : phoneInfo) {
            System.out.println(p.getBrand()+":"+p.getPrice());
        }

    }

    public static ArrayList<Phone> getPhoneInfo(ArrayList<Phone> list) {
        ArrayList<Phone> resultList = new ArrayList<>();
        for (Phone p : list) {
            double price = p.getPrice();
            if (price < 3000) {
                resultList.add(p);
            }
        }
        return resultList;
    }

}
