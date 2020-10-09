import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Q2_6 {
    public static void main(String[] args) {
        int num;
        ArrayList<String> arrayList = new ArrayList();
        Scanner input = new Scanner(System.in);
        num = input.nextInt();
        for(int i = 0; i < num; ++i){
            arrayList.add(input.next());
        }
        for(int i = 0; i < num; ++i){
            String t = arrayList.get(i);
            for(int j = 0; j < t.length() - 1; ++j){
                System.out.print(Math.abs(t.charAt(j) - t.charAt(j + 1)));
            }
            System.out.print("\n");
        }
    }
}