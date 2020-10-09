import java.util.Scanner;

public class Q2_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.next().toUpperCase();
        char ch = input.next().toUpperCase().charAt(0);
        int iter = 0;
        int iter2 = 0;
        for(int i = 0; i < str.length(); ++i){
            if(str.charAt(i) == ch){
                if(iter2 != 0)
                    System.out.print(i - iter + " ");
                iter = i;
                //System.out.print("__"+re+" re ");
                iter2++;
            }
        }
    }
}
