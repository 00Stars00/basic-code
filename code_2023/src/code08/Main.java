package code08;

import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        String num = "";
        StringBuilder A = new StringBuilder();
        StringBuilder B = new StringBuilder();
        Scanner scanner = new Scanner(System.in);
        num = scanner.nextLine();
        String[] nums = num.split(" ");
        int i = 0;
        while (num.charAt(i) != ' ') {
            A.append(num.charAt(i));
            i++;
        }
        i++;
        while (i < num.length()) {
            B.append(num.charAt(i));
            i++;
        }
        isNumber(A.toString());
        System.out.print(" + ");
        isNumber(B.toString());
        System.out.print(" = ");
        try {
            if (Integer.parseInt(A.toString()) > 0 && Integer.parseInt(B.toString()) > 0 && Integer.parseInt(A.toString()) <= 1000 && Integer.parseInt(B.toString()) <= 1000) {
                System.out.println(Integer.parseInt(A.toString()) + Integer.parseInt(B.toString()));
            } else {
                System.out.println("?");
            }
        } catch (Exception e) {
            System.out.println("?");
        }
    }
    private static void isNumber(String a) {
        try {
            if (Integer.parseInt(a) < 1 || Integer.parseInt(a) > 1000) {
                System.out.print("?");
            } else {
                System.out.print(a);
            }
        } catch (Exception e) {
            System.out.print("?");
        }
    }
}
