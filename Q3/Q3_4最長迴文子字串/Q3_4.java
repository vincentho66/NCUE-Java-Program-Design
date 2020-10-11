import java.util.ArrayList;
import java.util.Scanner;
public class Q3_4 {
    public static void main(String arg[]){
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        int max = 0;
        ArrayList<String> strings = new ArrayList<String>();
        for(int l=0;l<str.length();l++){
            for(int r = l+1;r<str.length();r++){
                if(r-l+1 % 2 == 0){
                    if(check(l,r,str,(r-l+1)/2)){
                        if(r-l+1 > max){
                            max = r-l+1;
                            strings.clear();
                            strings.add(str.substring(l,r+1));
                        }else if(r-l+1 == max){
                            strings.add(str.substring(l,r+1));
                        }
                    }
                }else{
                    if(check(l,r,str,(r-l)/2)){
                        if(r-l+1 > max){
                            max = r-l+1;
                            strings.clear();
                            strings.add(str.substring(l,r+1));
                        }else if(r-l+1 == max){
                            strings.add(str.substring(l,r+1));
                        }
                    }
                }
            }
        }
        for(String q:strings){
            System.out.print(q+" ");
        }
        return;
    }

    public static boolean check(int l, int r, String str, int t){
        for(int i =0;i <=t;i++){
            if(str.charAt(l+i) != str.charAt(r-i)){
                return false;
            }
        }
        return true;
    }


}
