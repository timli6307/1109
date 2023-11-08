import java.util.Scanner;

public class a6{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("請輸入起始年份");
        int a = input.nextInt();
        System.out.print("請輸入結束年份");
        int b = input.nextInt();
        int x = 0;
        for(int y=a; y<=b; y++){
            if(good(y))
            x++;
        }
        System.out.printf(a+"年到"+b+"年共有"+x+"個閏年");
    }
    public static boolean good(int a){
        if (a % 4 == 0 && a % 100 != 0 || a % 400 == 0)
            return true;
        else
            return false;
    }
}