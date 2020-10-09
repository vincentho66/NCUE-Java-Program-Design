import java.util.Scanner;
import java.text.*;

public class Q1_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat fmt = new DecimalFormat("0.0");
        double[] a;
        a = new double[6];
        double sum = 0.0;
        double avr;
        for(int i = 0; i < 5; ++i) {
            a[i] = Double.parseDouble(input.next());
            sum += a[i];
        }
        avr = sum / 5.0;
        System.out.println("Sum = " + fmt.format(sum));
        System.out.println("Average = " + fmt.format(avr));
    }
}
