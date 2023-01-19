package com.ithuoyan.test1;

import java.util.Random;

public class Role {
    private String name;
    private int blood;

    public Role() {
    }

    public Role(String name, int blood) {
        this.name = name;
        this.blood = blood;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBlood() {
        return blood;
    }

    public void setBlood(int blood) {
        this.blood = blood;
    }

    //定义一个方法用于攻击别人
    public void attack(Role role) {
        Random random = new Random();
        int hurt = random.nextInt(20) + 1;
        int remainBoold = role.getBlood() - hurt;
        remainBoold = Math.max(remainBoold, 0);
        role.setBlood(remainBoold);
        System.out.println(this.getName() + "举起拳头，打了" + role.getName() + "一下，" +
                "造成了" + hurt + "点伤害," + role.getName() + "还剩" + remainBoold + "点血");
    }
}
