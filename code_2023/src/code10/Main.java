package code10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        StringBuilder[] students = new StringBuilder[n + 1];
        for (int i = 0; i < n; i++) {
            String id = scanner.next();
            int num = scanner.nextInt();
            int number = scanner.nextInt();
            students[num] = new StringBuilder(id + " " + number);
        }
        int m = scanner.nextInt();
        for (int i = 0; i < m; i++) {
            int number = scanner.nextInt();
            System.out.println(students[number].toString());
        }
    }
}
