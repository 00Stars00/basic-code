package code11;

import java.util.Scanner;

public class Main {
    // 念数字
    public static void main(String[] args) {
        String[] a = {"ling", "yi", "er", "san", "si", "wu", "liu", "qi", "ba", "jiu"};
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        boolean flag = num < 0;
        if (flag) {
            num = -num;
        }
        String s = String.valueOf(num);
        for (int i = 0; i < s.length(); i++) {
            if (flag && i == 0) {
                System.out.print("fu ");
            }
            System.out.print(a[s.charAt(i) - '0']);
            if (i != s.length() - 1) {
                System.out.print(" ");
            }
        }
    }
}
