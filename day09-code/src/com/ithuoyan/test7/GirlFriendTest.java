package com.ithuoyan.test7;

public class GirlFriendTest {
    public static void main(String[] args) {
        GirlFriend[] girlFriends = new GirlFriend[4];
        girlFriends[0] = new GirlFriend("小诗诗", 18, "女", "唱歌");
        girlFriends[1] = new GirlFriend("小丹丹", 19, "女", "唱歌");
        girlFriends[2] = new GirlFriend("小花花", 22, "女", "唱歌");
        girlFriends[3] = new GirlFriend("小明明", 25, "女", "唱歌");

        int sum = 0;
        for (GirlFriend girlFriend : girlFriends) {
            sum += girlFriend.getAge();
        }
        int avg = sum / girlFriends.length;
        System.out.println("The average age is: " + avg);

        int count = 0;
        for (GirlFriend girlFriend : girlFriends) {
            if (girlFriend.getAge() < avg) {
                count++;
                System.out.println(girlFriend);
            }
        }
        System.out.println(count+"个女朋友的年龄小于平均年龄");
    }


}
