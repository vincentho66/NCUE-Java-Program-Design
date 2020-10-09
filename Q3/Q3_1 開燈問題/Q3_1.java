import java.util.Scanner;

public class Q3_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int k = input.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; ++i) {
            a[i] = 1;
        }
        for(int i = 2; i <= k; ++i) {
            for(int j = 0; j < n; ++j) {
                if ((j + 1) % i == 0) {
                    if (a[j] == 0)
                        a[j] = 1;
                    else
                        a[j] = 0;
                }
            }
        }
        for(int i = 0; i < n; ++i) {
            if(a[i] == 1)
                System.out.print(i + 1 + " ");
        }
    }
}
