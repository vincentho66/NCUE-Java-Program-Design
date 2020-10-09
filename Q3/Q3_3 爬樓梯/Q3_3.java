import java.util.Scanner;

public class Q3_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println(f(n + 1));
    }
    public static long f(int x) {
        if(x == 1 || x == 2)
            return 1;
        else
            return f(x - 1) + f(x - 2);
    }
}
