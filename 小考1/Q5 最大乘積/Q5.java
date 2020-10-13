import java.util.*;

public class Q5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] a = new int[n];
        //ArrayList a = new Arraylist();
        for(int i = 0; i < n; ++i) {
            a[i] = input.nextInt();
        }
        long max = 0L;
        max = a[0];
        for(int i = 0; i < n; ++i) {
            //max = a[i];
            int tmp = a[i];
            for(int j = i + 1; j < n; ++j) {
                //System.out.println(max);
                if(tmp * a[j] >= max) {
                    tmp *= a[j];
                    max = tmp;
                }
                else
                    tmp *= a[j];
            }
        }
        if(max <= 0)
            System.out.println("0");
        else
            System.out.println(max);
    }
}
