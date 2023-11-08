import java.util.Scanner;

public class a8 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("請輸入第一個數: ");
        int sum = input.nextInt();
        int toto = sum;
        System.out.print("請輸入第二個數: ");
        int som = input.nextInt();
        int sum2 = som;
        for (int sum1 = sum; sum1 < sum2; sum1++) {
            toto = toto * (sum1 + 1);
        }
        System.out.println(toto);
    }
}