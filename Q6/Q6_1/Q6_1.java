import java.util.ArrayList;
import java.util.Scanner;
class CShape // 父類別CShape
{
    public double area()
    {
        return 0.0;
    }
}
class CCircle extends CShape{
    double r;
    CCircle(double r){
        this.r = r;
    }
    @Override
    public double area(){
        return r*r*3.14159;
    }
}
class CSquare extends CShape{
    double r;
    CSquare(double r){
        this.r = r;
    }
    @Override
    public double area(){
        return r*r;
    }
}
class CTriangle extends CShape{
    double r,j;
    CTriangle (double r,double j){
        this.r = r;
        this.j = j;
    }
    @Override
    public double area() {
        return r*j/2;
    }
}
public class Q6_1 {
    public static void main(String args[]){
        ArrayList<CShape> arrayList = new ArrayList<>();
        arrayList.add(new CCircle(2.0));
        arrayList.add(new CCircle(3.0));
        arrayList.add(new CSquare(4.0));
        arrayList.add(new CSquare(5.0));
        arrayList.add(new CTriangle(3.0,3.0));
        arrayList.add(new CTriangle(5.0,4.0));
        largest(arrayList);
    }

    public static void largest(ArrayList<CShape> arrayList){
        double max = Double.MIN_VALUE;
        int cou=1;
        for(CShape i:arrayList){
            System.out.println("面積"+cou+" = "+i.area());
            if(i.area()>max){
                max = i.area();
            }
            cou++;
        }
        System.out.println("面積最大 ="+ max);
    }
}
