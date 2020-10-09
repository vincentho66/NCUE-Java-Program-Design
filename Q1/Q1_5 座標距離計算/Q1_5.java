import java.util.Scanner;
import java.text.*;

public class Q1_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat fmt = new DecimalFormat("0.00");
        double x1 = Double.parseDouble(input.next());
        double y1 = Double.parseDouble(input.next());
        double x2 = Double.parseDouble(input.next());
        double y2 = Double.parseDouble(input.next());
        double dis = Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));
        System.out.println("Distance = " + fmt.format(dis));
    }
}
