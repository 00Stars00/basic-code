package code14;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //  不变初心数
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[] a = new int[num];
        for (int i = 0; i < num; i++) {
            a[i] = scanner.nextInt();
        }
        for (int i = 0; i < num; i++) {
            if (isChuXin(a[i])) {
                System.out.println(getNum(a[i]));
            } else {
                System.out.println("NO");
            }
        }
    }

    // 求和
    public static int getNum(int num) {
        int sum = 0;
        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

    // 初心数
    public static boolean isChuXin(int num) {
        for (int i = 2; i <= 9; i++) {
            if (getNum(num) != getNum(num * i)) {
                return false;
            }
        }
        return true;
    }
}
