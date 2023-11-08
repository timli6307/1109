import java.util.Scanner;

public class a7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("請輸入金額: ");
        int sum = input.nextInt();
        int a = 0, b = 0, c = 0, d = 0, e = 0, f = 0;
        while (sum != 0) {
            if (sum >= 500) {
                sum = sum - 500;
                ++a;
            } else if (sum >= 100) {
                sum = sum - 100;
                ++b;
            } else if (sum >= 50) {
                sum = sum - 50;
                ++c;
            } else if (sum >= 10) {
                sum = sum - 10;
                ++d;
            } else if (sum >= 5) {
                sum = sum - 5;
                ++e;
            } else if (sum >= 1) {
                sum = sum - 1;
                ++f;
            }
        }
        System.out.print("找你"+a+"張500元"+b+"張100元"+c+"個50元"+d+"個10元"+e+"個5元"+f+"個1元");

    }
}