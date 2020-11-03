import java.util.*;

class point {
    private double x, y;
    point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public double distance() {
        return Math.pow(Math.pow(x, 2) + Math.pow(y, 2), 0.5);
    }
    public double distance(point p) {
        return Math.pow(Math.pow(p.x - this.x, 2) + Math.pow(p.y - this.y, 2), 0.5);
    }
}
public class Q5_4 {
    public static void main(String[] args){
        double max = Integer.MIN_VALUE;
        int i_current = 0;
        ArrayList<point> arrayList = new ArrayList();
        Scanner input = new Scanner(System.in);
        try{
            for(int i = 0; i < 3; ++i) {
                arrayList.add(new point(input.nextDouble(), input.nextDouble()));
            }
        }
        catch(InputMismatchException e){
            return;
        }
        System.out.print("與原點距離 : ");
        for(point i : arrayList){
            System.out.print(i.distance() + " ");
        }
        System.out.print("\n" + "任兩點距離 : ");
        for (int i = 0; i < 3; ++i){
            if(i + 1 == 3) {
                System.out.print(arrayList.get(i).distance(arrayList.get(0)) + " ");
                if(max < arrayList.get(i).distance(arrayList.get(0))) {
                    max = arrayList.get(i).distance(arrayList.get(0));
                    i_current = i;
                }
            }
            else {
                System.out.print(arrayList.get(i).distance(arrayList.get(i+1)) + " ");
                if(max < arrayList.get(i).distance(arrayList.get(i+1))) {
                    max = arrayList.get(i).distance(arrayList.get(i+1));
                    i_current = i;
                }
            }
        }
        switch (i_current) {
            case 0 -> System.out.println("\n距離最遠的兩個點: A B");
            case 1 -> System.out.println("\n距離最遠的兩個點: B C");
            case 2 -> System.out.println("\n距離最遠的兩個點: C A");
        }
    }
}
