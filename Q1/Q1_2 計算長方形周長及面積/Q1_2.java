import java.util.Scanner;
import java.text.*;

public class Q1_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double h = input.nextDouble();
        double w = input.nextDouble();
        double per = (h + w) * 2;
        double area = h * w;
        DecimalFormat fmt = new DecimalFormat("0.00");
        System.out.println("Height = " + fmt.format(h));
        System.out.println("Width = " + fmt.format(w));
        System.out.println("Perimeter = " + fmt.format(per));
        System.out.println("Area = " + fmt.format(area));
    }
}
