public class a1 {
    public static void main(String[] args) {
        int size = 9; // 十字架的大小

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == size/2 || j == size/2|| i==0 || j==0 || i==size-1 || j== size-1) {
                    System.out.print("Ｘ");
                } else {
                    System.out.print("Ｏ");
                }
            }
            System.out.println();
        }
    }
}


