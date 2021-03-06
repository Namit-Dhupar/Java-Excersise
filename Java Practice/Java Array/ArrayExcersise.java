import java.util.Scanner;
public class ArrayExcersise {

	public static void main(String[] args) {
		int[] arr = takeInput();
		display(arr);
		System.out.println();
		//max(arr);
		//min(arr);
        //search(arr,5);
		reverse(arr,0,arr.length-1);
		display(arr);
		//System.out.println(BinarySearch(arr, 5));
	}
	//Taking Input of an array
	public static int[] takeInput() {
		Scanner inp = new Scanner(System.in);
		System.out.println("Enter the Size of the array");
		int n = inp.nextInt();
		int[] arr = new int[n];
		for(int i=0 ; i<arr.length ; i++) {
			System.out.println("Enter the "+(i+1)+" Element");
			arr[i] = inp.nextInt();
		}
		inp.close();
		return arr;
	}
	
	public static void display(int[] arr) {
		for(int i=0; i<arr.length ; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public static void max(int[] arr) {
		for(int i=0; i<arr.length ; i++) {
			if(arr[0]<=arr[i]) //if first index is less then it will store the value of the next el
		    arr[0] = arr[i];//And will Continue till the max Element is found
		}
		System.out.println("The Max element is "+arr[0]);
	}
	
	public static void min(int[] arr) {
		for(int i=0 ; i<arr.length ; i++) {
			if(arr[0]>=arr[i])
				arr[0]=arr[i];
		}
		System.out.println("The Min Element is "+ arr[0]);
	}
	
	//linear Search
	public static void search(int[] arr, int m) {
		int found = 0;
		int i;
		for(i=0 ; i<arr.length ; i++) {
			if(m==arr[i])
			{
				found=1; //raise the found flag
				break;
			}
		}
		if(found==1)
		    System.out.println(m+" is at the postion "+(i+1));
		else
			System.out.println(m+" is at the postion -1");
		
	}
	
	public static void reverse(int[] arr, int start, int end) {
		System.out.println("The Reverse of the Array is:");
		int temp=0;
		while(start < end) {
			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
   }
	
   //Array Binary Search
	public static int BinarySearch(int[] arr, int element) {
		int index = -1;
		int left = 0;
		int right = arr.length - 1;
		while (left <= right) {
			int mid = (left + right) / 2;
			if (arr[mid] == element) {
				index = mid;
				break;
			}
			if (arr[mid] < element) {
				left = mid + 1;
			}
			if (arr[mid] > element) {
				right = mid - 1;
			}
		}
		return index;
	}
}
