package code12;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 检查密码
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        String[] a = new String[num];
        for (int i = 0; i < num; i++) {
            a[i] = scanner.nextLine();
        }
        for (int i = 0; i < num; i++) {
            if (a[i].length() < 6) {
                System.out.println("Your password is tai duan le.");
                continue;
            }
            boolean flag1 = false;  // 数字
            boolean flag2 = false;  // 字母
            for (int j = 0; j < a[i].length(); j++) {
                if (a[i].charAt(j) >= '0' && a[i].charAt(j) <= '9') {
                    flag1 = true;
                } else if ((a[i].charAt(j) >= 'a' && a[i].charAt(j) <= 'z') || (a[i].charAt(j) >= 'A' && a[i].charAt(j) <= 'Z')) {
                    flag2 = true;
                } else if (a[i].charAt(j) != '.') {
                    System.out.println("Your password is tai luan le.");
                    break;
                }
                if (j == a[i].length() - 1) {
                    if (flag1 && flag2) {
                        System.out.println("Your password is wan mei.");
                    } else if (flag1) {
                        System.out.println("Your password needs zi mu.");
                    } else if (flag2){
                        System.out.println("Your password needs shu zi.");
                    }
                }
            }
        }
        scanner.close();
    }
}
