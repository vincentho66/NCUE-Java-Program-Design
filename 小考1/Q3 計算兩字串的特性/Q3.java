import java.util.*;

public class Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str1 = input.next();
        String str2 = input.next();
        int sum1 = 0, sum2 = 0;
        for(int i = 0; i < str1.length(); ++i) {
            if(str1.charAt(i) == str2.charAt(i))
                sum1++;
            else if((str2.indexOf(str1.charAt(i)) != -1) && (str2.indexOf(str1.charAt(i)) != i))
                sum2++;
        }
        System.out.println(sum1 + " " + sum2);
    }
}
