import java.util.Scanner;

public class Q3_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int m = input.nextInt();
        int n = input.nextInt();
        int[][] a = new int[m][n];
        for(int i = 0; i < m; ++i) {
            for(int j = 0; j < n; ++j) {
                a[i][j] = input.nextInt();
            }
        }
        for(int i = 0; i < n; ++i) {
            for(int j = 0; j < m; ++j) {
                System.out.print(a[j][i] + " ");
            }
            System.out.println();
        }
    }
}
