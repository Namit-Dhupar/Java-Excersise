import java.util.Scanner;
public class TakingInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner inp = new Scanner(System.in);
		//Taking Input of an integer
		System.out.println("Enter A Number");
		int n = inp.nextInt();
		// Taking Input of String
		System.out.println("Enter A String ");
		inp.nextLine();
		String s = inp.nextLine();
		
		System.out.println("The Integer Input is " + n );
		System.out.println("The String Input is " + s);

	}

}
