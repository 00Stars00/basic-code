import java.util.Scanner;

public class code04 {
    public static void main(String[] args) {
        // 跟奥巴马一起画方块
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        String str = scanner.next();
        int row = num / 2;
        if (num % 2 != 0) {
            row += 1;
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < num; j++) {
                System.out.print(str);
            }
            System.out.println();
        }
    }
}
