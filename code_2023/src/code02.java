import java.util.Scanner;

public class code02 {
    public static void main(String[] args) {
        // 计算指数
        Scanner scanner = new Scanner(System.in);
        int exponent = scanner.nextInt();
        int result = (int) Math.pow(2, exponent);
        System.out.println("2^"+exponent+" = "+result);
    }
}
