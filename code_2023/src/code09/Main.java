package code09;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 个位数统计
        int[] a = new int[10];
        for (int i = 0; i < 10; i++) {
            a[i] = 0;
        }
        Scanner scanner = new Scanner(System.in);
        String num = scanner.nextLine();
        for (int i = 0; i < num.length(); i++) {
            a[num.charAt(i) - '0']++;
        }
        for (int i = 0; i < 10; i++) {
            if (a[i] != 0) {
                System.out.println(i + ":" + a[i]);
            }
        }
    }
}
