package com.ithuoyan.test5;

import java.util.Scanner;

public class CarTest {
    public static void main(String[] args) {
        Car[] cars = new Car[3];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < cars.length; i++) {
            Car car = new Car();
            System.out.println("请输入第" + (i + 1) + "个车的品牌：");
            car.setBrand(scanner.next());
            System.out.println("请输入第" + (i + 1) + "个车的价格：");
            car.setPrice(scanner.nextInt());
            System.out.println("请输入第" + (i + 1) + "个车的颜色：");
            car.setColor(scanner.next());
            cars[i] = car;
        }

        for (int i = 0; i < cars.length; i++) {
            System.out.println("第" + (i + 1) + "个车的品牌是：" + cars[i].getBrand());
            System.out.println("第" + (i + 1) + "个车的价格是：" + cars[i].getPrice());
            System.out.println("第" + (i + 1) + "个车的颜色是：" + cars[i].getColor());
        }
    }
}
