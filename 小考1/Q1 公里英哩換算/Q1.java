import java.text.DecimalFormat;
import java.util.*;

public class Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat fmt = new DecimalFormat("0.0");
        double x = Double.parseDouble(input.next());
        double y = Double.parseDouble(input.next());
        double z = Double.parseDouble(input.next());
        double h = x / 60 + y / (60 * 60);
        double speed = (z / 1.6) / h;
        System.out.println("Speed = " + fmt.format(speed));
    }
}
