
public class SwapValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {1,2,3,4,5};
		System.out.println(arr[3] + " " + arr[4]);
		swapArray(arr, 3,4);
		System.out.println(arr[3] + " " + arr[4]);
 
	}
	public static void swapArray(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}
