import java.io.*;
import java.util.*;
public class Q7_1 {
	public static void main(String arg[]) throws IOException {
		String string = "";
		FileReader fileReader = new FileReader("c:\\file_practice.txt");
		FileWriter fileWriter = new FileWriter("c:\\out.txt");
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		while ((string = bufferedReader.readLine())!= null) {
			StringTokenizer stringTokenizer = new StringTokenizer(string);
			int n  = stringTokenizer.countTokens();
			int sum =0;
			while(stringTokenizer.hasMoreTokens()){
				sum += Integer.parseInt(stringTokenizer.nextToken());
			}
			fileWriter.write(Double.toString((double)sum/n));
			fileWriter.write("\r\n");
		}
		fileReader.close();
		fileWriter.close();
		bufferedReader.close();
	}
}