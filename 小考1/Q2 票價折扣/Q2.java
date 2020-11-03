import java.util.*;

public class Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int sum = 0;
        while(n > 0) {
            if(n / 10 > 0) {
                sum += price(10) * (n / 10);
                n %= 10;
            }
            else if(n / 5 > 0) {
                sum += price(5) * (n / 5);
                n %= 5;
            }
            else if(n / 2 > 0) {
                sum += price(2) * (n / 2);
                n %= 2;
            }
            else if(n > 0) {
                sum += price(1) * n;
                n = 0;
            }
        }
        System.out.println(sum);
    }
    public static int price(int x) {
        if(x == 1)
            return 100;
        else if(x == 2)
            return 180;
        else if(x == 5)
            return 440;
        else if(x == 10)
            return 800;
        else
            return -1;
    }
}
