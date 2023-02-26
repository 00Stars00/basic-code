package code15;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double KG = scanner.nextDouble();
        double M = scanner.nextDouble();
        double BMI = KG / (M * M);
        System.out.printf("%.1f\n", BMI);
        if (BMI >25.0) {
            System.out.println("PANG");
        } else {
            System.out.println("Hai Xing");
        }
    }
}
