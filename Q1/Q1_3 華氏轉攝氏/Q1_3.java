import java.util.Scanner;
import java.text.*;

public class Q1_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat fmt = new DecimalFormat("0.00");
        double f = Double.parseDouble(input.next());
        double c = (f - 32.0) * 5.0 / 9.0;
        System.out.println("Fahrenheit " + fmt.format(f) + " ---> Celsius " + fmt.format(c));
    }
}
