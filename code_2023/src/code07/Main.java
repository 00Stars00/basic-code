package code07;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 人民币兑换
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int money = 150;
        for (int i = 1; i < money / 5; i++) {
            for (int j = 1; j < money / 2; j++) {
                for (int k = 1; k < money; k++) {
                    if (i * 5 + j * 2 + k == money) {
                        if (i + j + k == 100) {
                            if (n == 0) {
                                return;
                            }
                            System.out.println( i +" "+ j +" "+ k );
                            n--;
                        }
                    }
                }
            }
        }
    }
}
