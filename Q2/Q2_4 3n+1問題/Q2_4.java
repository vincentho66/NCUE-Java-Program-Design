import java.util.Scanner;

public class Q2_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int count = 0;
        while(n != 1) {
            if(n % 2 != 0) {
                n = odd(n);
                count++;
            }
            else {
                n = even(n);
                count++;
            }
        }
        System.out.println(count);
    }
    static int odd(int x) {
        return 3 * x + 1;
    }
    static int even(int x) {
        return x / 2;
    }
}
