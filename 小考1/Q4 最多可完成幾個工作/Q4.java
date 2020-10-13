import java.util.*;

public class Q4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[][] a = new int[n][2];
        for(int i = 0; i < n; ++i) {
            a[i][0] = input.nextInt();
            a[i][1] = input.nextInt();
        }
        int max = 1;
        int tmp = 1;
        //int begin = 0;
        int end = 0;
        for(int i = 0; i < n; ++i) {
            //begin = a[i][0];
            end = a[i][1];
            for(int j = i + 1; j < n; ++j) {
                if(a[j][0] >= end) {
                    //begin = a[j][0];
                    end = a[j][1];
                    tmp++;
                }
                /*else if(a[j][1] <= begin) {
                    begin = a[j][0];
                    //end = a[j][1];
                    tmp++;
                }*/
            }
            if(tmp >= max)
                max = tmp;
        }
        System.out.println(max);
    }
    public static void sort(int[][] a) {

    }
}
