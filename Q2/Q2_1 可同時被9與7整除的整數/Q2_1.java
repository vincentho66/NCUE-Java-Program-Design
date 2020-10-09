import java.util.Scanner;
//import java.text.*;

public class Q2_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for(int i = 1; i <= n; ++i) {
            if((i % 7 == 0) && (i % 9 == 0)) {
                System.out.print(i + " ");
            }
        }
    }
}
