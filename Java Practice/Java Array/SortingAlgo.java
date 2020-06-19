import java.util.Scanner;
public class SortingAlgo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int []arr = takeInput();
        display(arr);
        System.out.println();
        /**********SELECTION SORT**********/
        System.out.println("The Selection sort for the array is");
        SelectionSort(arr);
        display(arr);
        System.out.println();
        /**********************************/
        
        /**********BUBBLE SORT**********/
        System.out.println("The Bubble sort for the array is");
        BubbleSort(arr);
        display(arr);
        System.out.println();
        /**********************************/
        /**********INSERTION SORT**********/
        System.out.println("The Insertion sort for the array is");
        InsertionSort(arr);
        display(arr);
        System.out.println();
        /**********************************/
        int arr1[] = {1, 2, 3, 1, 2, 4, 1}; 
        int arr2[] = {2, 1, 3, 1, 5, 2, 2}; 
        int m = arr1.length; 
        int n = arr2.length; 
        System.out.println("Intersection is:");
        intersection(arr1, arr2, m, n);
        /********SUM PAIR IS*************/
        System.out.println("The Sum Pair is");
        sumpair(arr,8);
        /********************************/
        /********SUM TRIPLE IS*************/
        System.out.println("The Sum Triple is");
        sumtriplet(arr,8);
        /********************************/
	}
    public static int[] takeInput() {
    	Scanner inp = new Scanner(System.in);
    	int n = inp.nextInt();
    	int [] arr = new int[n];
    	for(int i=0 ; i<arr.length ; i++) {
    		arr[i] = inp.nextInt();
    	}
    	inp.close();
    	return arr;
    }
    
    public static void display(int [] arr) {
    	for(int i=0 ; i<arr.length ; i++) {
    		System.out.print(arr[i]+" ");
    	}
    }
    
    //TIME COMPLEXITY: O(n^2)
    //SPACE COMPLEXITY: O(1)
    public static int [] SelectionSort(int [] arr) {
    	for(int i=0 ; i<arr.length ; i++) {
    		int min_index = i;
    		for(int j=i+1 ; j<arr.length; j++)
    		{
    			if(arr[min_index]>arr[j])
    				min_index = j;
    		}
    		
    		int temp = arr[min_index];
    		arr[min_index] = arr[i];
    		arr[i] = temp;
    	}
    	return arr;
    }
    
    //BOTH TIME AND SPACE COMPLEXITY= O(N^2)
    //Can be optimized by exiting the loop if inner loop has no swap conditions
    public static int [] BubbleSort(int[] arr) {
    	boolean swapped;
    	for(int i=0; i<arr.length ; i++) {
    		swapped = false;
    		for(int j=0 ; j<arr.length-1 ; j++) {
    			if(arr[j]>arr[j+1]) {
    				int temp = arr[j];
    				arr[j] = arr[j+1];
    				arr[j+1] = temp;
    				swapped = true;
    			}
    		}
    		if(swapped == false)
    			break;
    	}
    	return arr;
    }
    
    public static int [] InsertionSort(int[] arr) {
    	int j;
    	for(int i=0 ; i<arr.length ; i++) {
    		int key = arr[i];
    		for(j=i-1 ; j>=0 && arr[j]>key ; j--) {
    			arr[j+1] = arr[j];
    		}
    		arr[j+1] = key;
    	}
    	return arr;
    }
    
    public static void intersection(int[] arr1, int [] arr2, int m, int n) {
    	int i=0,j=0;
    	while(i<m && j<n) {
    		if(arr1[i]<arr2[j])
    			i++;
    		else if(arr1[i]>arr2[j])
    			j++;
    		else if(arr1[i]==arr2[j]) {
    			System.out.print(arr2[j++]+ " ");
    			i++;
    		}
    	}
    }
    
    public static void sumpair(int[] arr, int target) {
    	for(int i=0 ; i<arr.length ; i++) {
    		for(int j=i+1; j<arr.length; j++) {
    			if(arr[i]+arr[j] == target)
    				System.out.println(arr[i]+" & "+arr[j]);
    		}
    	}
    }
    
    public static void sumtriplet(int[] arr, int target) {
    	for(int i=0 ; i<arr.length ; i++) {
    		for(int j=i+1; j<arr.length; j++) {
    			for(int k=j ; k<arr.length ; k++) {
    			if(arr[i]+arr[j] +arr[k] == target)
    				System.out.println(arr[i]+" & "+arr[j]+" & "+arr[k]);
    			}
    		}
    	}
    }
    
}
