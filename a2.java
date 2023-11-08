import java.util.Scanner;

public class a2 {
    public static void main(String[] args) {
        Scanner keyin = new Scanner(System.in);
        System.out.print("輸入第一個正整數: ");
        int num1 = keyin.nextInt();
        System.out.print("輸入第二個正整數: ");
        int num2 = keyin.nextInt();
        System.out.print("兩個整數之間的質數為: ");

        int sum = 0;

        for (int i = num1; i <= num2; i++) {
            boolean prime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    prime = false;
                    break;
                }
            }
            if (prime) {
                System.out.print(i + " ");
                sum += i;
            }
        }
        System.out.print("\n質數和為: " + sum);
    }
}