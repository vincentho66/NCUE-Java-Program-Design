class CTriangle{
    private double base;
    private double height;
    private String color;
    public void setB(double b) {
        this.base = b;
    }
    public void setH(double h) {
        this.height = h;
    }
    public void setColor(String s) {
        this.color = s;
    }
    public CTriangle() {
        setB(10);
        setColor("blue");
        setH(5);
    }
    public CTriangle(double b, double h, String color) {
        setB(b);
        setColor(color);
        setH(h);
    }
    public void show() {
        System.out.println("color=" + this.color);
        System.out.println("base=" + this.base + ", height=" + this.height + "\n");
    }
}

public class Q5_2 {
    public static void main(String[] args) {
        CTriangle cTriangle = new CTriangle();
        CTriangle cTriangle2 = new CTriangle(30,10,"red");
        cTriangle.show();
        cTriangle2.show();
        System.out.println("Process completed.");
    }
}