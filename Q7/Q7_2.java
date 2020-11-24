import java.io.*;
import java.nio.CharBuffer;

public class Q7_2 {
    public static void main(String arg[]) throws IOException {
        FileReader fileReader = new FileReader("c:\\file_practice_2.txt");
        FileWriter fileWriter = new FileWriter("c:\\out2.txt");
        char c[] =new char[2048];
        int num=0;
        fileReader.read(c);
        String s = String.valueOf(c);
        s = s.trim();
        System.out.println("短文的字元數(含空白)"+ s.length());
        s = s.replaceAll(" the "," THE ");
        fileWriter.write(c);
        for(int i = 0; i < s.length()-3;i++){
            if(s.charAt(i) == 'T'&&s.charAt(i+1) == 'H'&&s.charAt(i+2) == 'E'){
                num++;
            }
        }
        s = s.replaceAll(" ","");
        System.out.println("短文的字元數(不含空白)"+ s.length()+1);
        System.out.println("共有"+ num+"個被取代");
    }
}
