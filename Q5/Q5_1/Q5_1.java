import java.util.*;
class CSphere
{
    private int x; // 圓心的x 座標
    private int y; // 圓心的y 座標
    private int z; // 圓心的z 座標
    private int radius; // 圓球的半徑
    private static double pi = 3.14;
    public void setLocation(int x,int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public void setRadius(int r) {
        this.radius = r;
    }
    public double surfaceArea() {
        return 4 * pi * Math.pow(radius, 2);
    }
    public double volume() {
        return (4.0 / 3.0) * Math.pow(radius, 3) * pi;
    }
    public void showCenter() {
        System.out.println("x=" + x + " y=" + y + " z=" + z);
    }
    CSphere(int x,int y, int z,int r) {
        setLocation(x, y, z);
        setRadius(r);
    }
}
public class Q5_1 {
    public static void main(String[] args) {
        int x,y,z,r;
        Scanner input = new Scanner(System.in);
        x =input.nextInt();
        y =input.nextInt();
        z =input.nextInt();
        r =input.nextInt();
        CSphere sphere = new CSphere(x, y, z, r);
        sphere.showCenter();
        System.out.println(sphere.surfaceArea());
        System.out.println(sphere.volume());
    }
}