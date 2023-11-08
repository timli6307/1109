public class a0 {
    public static void main(String[] args) {
        for (int i=1;i<=9;i++){
            for (int j=1;j<=9;j++)
            if(i==1 || j==1 || i==9 || j==9 || i==j || i==10-j){
                System.out.printf("* ");
            }
            else{
                System.out.printf("  ");
            }
            System.out.println();
        }
    }
}