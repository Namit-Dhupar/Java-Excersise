import java.util.Scanner;
public class ArrayPract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner inp = new Scanner(System.in);
       int[] arr = new int[3];
      System.out.println("Enter the number to be stored in an array");
      for(int j=0; j<3 ; j++) {
    	  arr[j] = inp.nextInt();
    	  System.out.print(arr[j]+" "); //Entering the values in an array
      }
      inp.close();
       
	}

}
