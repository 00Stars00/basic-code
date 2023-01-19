package com.ithuoyan.test6;

public class PhoneTest {
    public static void main(String[] args) {
        Phone[] phones = new Phone[3];
        phones[0] = new Phone("Apple", 8888, "Black");
        phones[1] = new Phone("Huawei", 6666, "White");
        phones[2] = new Phone("Xiaomi", 5555, "Red");

        int sum = 0;
        for (Phone phone : phones) {
            sum += phone.getPrice();
        }
        int avg = sum / phones.length;
        System.out.println("The average price is: " + avg);
    }
}
