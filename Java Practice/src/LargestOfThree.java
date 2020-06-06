
import java.util.Scanner;
public class LargestOfThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 3 numbers");
		int a = sc.nextInt();
		int b =  sc.nextInt();
		int c = sc.nextInt();
		if(a>b && a>c) {
			System.out.println(a + " is the greatest number");
		}
		else if(b>a && b>c) {
			System.out.println(b + " is the greatest number");
		}
		else
			System.out.println(c + " is the greatest number");

	}

}
