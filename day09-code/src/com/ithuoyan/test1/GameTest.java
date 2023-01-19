package com.ithuoyan.test1;

public class GameTest {
    public static void main(String[] args) {
        Role role1 = new Role("张三", 100);
        Role role2 = new Role("李四", 100);

        while (true) {
            role1.attack(role2);
            if (role2.getBlood() == 0) {
                System.out.println(role2.getName() + "已经死亡，游戏结束");
                break;
            }
            role2.attack(role1);
            if (role1.getBlood() == 0) {
                System.out.println(role1.getName() + "已经死亡，游戏结束");
                break;
            }
        }
    }
}
