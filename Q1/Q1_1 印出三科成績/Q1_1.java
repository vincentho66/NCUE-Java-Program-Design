import java.util.Scanner;
import java.text.*;

public class Q1_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name = input.next();
        int score1 = input.nextInt();
        int score2 = input.nextInt();
        int score3 = input.nextInt();
        System.out.println(name + " " + score1 + "," + score2 + "," + score3);
    }
}
