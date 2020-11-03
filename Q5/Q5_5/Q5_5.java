import java.util.Scanner;
class CNumber {
    int num;

    public CNumber(int n) {
        num = n;
    }

    public boolean prime() {
        int flag = 1;
        if(num == 1)
            return false;
        for (int i = 2; i < num; i++)
            if (num % i == 0) {
                flag = 0;
                break;
            }
        if (flag == 1)
            return true;
        else
            return false;
    }
}
public class Q5_5 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int f,e;
        int cou=0;
        f = scanner.nextInt();
        e = scanner.nextInt();
        for(;f+4<=e;f++){
            if(new CNumber(f).prime() && new CNumber(f+4).prime()){
                System.out.print("("+f+","+(f+4)+")");
                cou++;
            }
        }
        System.out.print("共"+cou+"個");
    }
}

