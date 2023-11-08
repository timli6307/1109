import java.util.Scanner;
//計算質數和
public class a5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("請輸入兩個正整數：");

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        printPrimes(a, b);
    }
    public static void printPrimes(int a, int b) {
        int count = 0;
        int sum = 0;

        System.out.println("在" + a + "和" + b + "之間的質數有：");

        for (int i = a; i <= b; i++) {
            boolean isPrime = isPrime(i);

            if (isPrime) {
                System.out.print(i + " ");
                count++;
                sum += i;
            }
        }

        System.out.println();

        System.out.println("質數的個數為：" + count);
        System.out.println("質數的和為：" + sum);
    }


    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}