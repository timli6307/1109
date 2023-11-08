import java.util.Scanner;
import java.util.Arrays;
//小到大
public class a3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("請輸入三個整數，並且用空格隔開：");
        int[] numbers = new int[3];

        for (int i = 0; i < 3; i++) {
            numbers[i] = scanner.nextInt();
        }

        Arrays.sort(numbers);
        System.out.println("排序後的結果為：");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}