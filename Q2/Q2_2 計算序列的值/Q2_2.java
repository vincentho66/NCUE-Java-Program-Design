import java.util.Scanner;

public class Q2_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        //int m = n * 3;
        //int l = n * 5;
        int f = 0;
        for(int i = 1; i <= n; ++i) {
            int m = i * 3;
            int l = i * 5;
            f += i * m * l;
        }
        System.out.println(f);
    }
}
