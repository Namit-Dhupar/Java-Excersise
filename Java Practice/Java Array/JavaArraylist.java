import java.util.*;;
public class JavaArraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Arraylist is used to make an array dynamic
		ArrayList<Integer> arrli = takeinput();
		display(arrli);
		

	}
	public static ArrayList<Integer> takeinput(){
		Scanner inp = new Scanner(System.in);
		System.out.println("Enter the number of elements you want in the Arraylist");
		int n = inp.nextInt();
		ArrayList<Integer> arrli = new ArrayList<Integer>(n); //Defining an arraylist
		for(int i=1 ; i<=n ; i++) {
			arrli.add(i);
		}
		inp.close();
		return arrli;
	}
	public static void display(ArrayList<Integer> arrli) {
		for(int i=0  ; i<arrli.size() ; i++) {
			System.out.print(arrli.get(i) + " ");
		}
	}
 
}
