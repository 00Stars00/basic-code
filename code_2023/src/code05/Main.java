package code05;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 计算天数
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] date = str.split("/");
        int year = Integer.parseInt(date[0]);
        int month = Integer.parseInt(date[1]);
        int day = Integer.parseInt(date[2]);
        int sum = 0;
        int[] arr = {31,28,31,30,31,30,31,31,30,31,30,31};
        if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            arr[1] = 29;
        }
        for (int i = 0; i < month - 1; i++) {
            sum += arr[i];
        }
        sum += day;
        System.out.println(sum);
    }
}
