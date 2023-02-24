import java.util.Scanner;

public class code03 {
    public static void main(String[] args) {
        // 计算阶乘和
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            int temp = 1;
            for (int j = 1; j <= i; j++) {
                temp *= j;
            }
            sum += temp;
        }
        System.out.println(sum);
    }
}
