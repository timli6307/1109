import java.util.Scanner;

public class a4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int BaseMoney = 16895;
        double sum;
        System.out.println("請輸入銷售金額：");
        int total = scanner.nextInt();

        if (total <= 5000) {
            sum = BaseMoney + total * 0.1;
        }
        else if (total <= 10000) {
            sum = BaseMoney + total * 0.13;
        }
        else if (total <= 15000) {
            sum = BaseMoney + total * 0.16;
        }
        else {
            sum = BaseMoney + total * 0.2;
        }

        System.out.println("小明的薪水總額為：" + sum + "元");
    }
}