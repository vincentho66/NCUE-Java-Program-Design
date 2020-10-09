import java.util.Scanner;

public class Q2_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        long sum = 0;
        for(int i = 0; i <= n; ++i) {
            sum += f(i);
        }
        System.out.println(sum);
    }
    static long f(int x) {
        if(x == 0)
            return 1;
        else
            return f(x - 1) * 2 + x;
    }
}
