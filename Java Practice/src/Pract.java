import java.util.Scanner;
public class Pract {
	 public static void main(String []argh){
		    int count = 0;
	        Scanner in = new Scanner(System.in);
	        String line = in.nextLine();
	        //in.hasNextLine();
	        while(line != null) {
	         System.out.println(++count + " " + line);
	         line = in.nextLine();
	        }
	        in.close();
	 }
}
