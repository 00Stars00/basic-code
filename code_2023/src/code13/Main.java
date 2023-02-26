package code13;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Pa = scanner.nextInt();
        int Pb = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if (Pa > Pb && (a == 0 || b == 0 || c == 0)) {
            System.out.println("The winner is a: " + Pa + " + " + (3 - a - b - c));
        } else if (Pa<Pb && a == 0 && b == 0 && c == 0){
            System.out.println("The winner is a: " + Pa + " + " + (3 - a - b - c));
        }else {
            System.out.println("The winner is b: " + Pb + " + " + (a + b + c));
        }
    }
}
