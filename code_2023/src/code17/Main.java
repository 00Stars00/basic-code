package code17;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int price = scanner.nextInt();
        for (int i = 0; i < num; i++) {
            double v = scanner.nextDouble();
            if (v<price) {
                System.out.printf("On Sale! %.1f\n",v);
            }
        }
    }
}
