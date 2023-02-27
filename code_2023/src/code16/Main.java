package code16;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[] a = new int[num];
        for (int i = 0; i < num; i++) {
            a[i] = scanner.nextInt();
        }
for (int i = 0; i < num; i++) {
            if (getNum(a[i]/1000)==getNum(a[i]%1000)) {
                System.out.println("You are lucky!");
            } else {
                System.out.println("Wish you good luck.");
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
}
