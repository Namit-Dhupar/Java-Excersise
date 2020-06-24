
public class MultiDimension {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] twodarr= {{11,12,13,14},
				           {21,22,23,24},
				           {31,32,33,34},
				           {41,42,43,44}};
		//waverow(twodarr);
		//wavecol(twodarr);
		spiralclock(twodarr);
	}
	
	public static void waverow(int[][] arr) {
		int j;
		for(int i=0 ; i<arr.length ; i++) {
			if(i%2!=0) {
				for(j=arr.length-1; j>=0 ; j--) {
					System.out.print(arr[i][j]+ " ");
				}	
			}
			else {
				for(j=0; j<=arr.length-1 ; j++) {
					System.out.print(arr[i][j]+ " ");
				}	
			}
		}
	} 
	
	public static void wavecol(int[][] arr) {
		int j;
		for(int i=0 ; i<arr.length ; i++) {
			if(i%2==0) {
				for(j=0; j<=arr.length-1 ; j++) {
					System.out.print(arr[j][i]+ " ");
				}	
			}
			else {
				for(j=arr.length-1; j>=0 ; j--) {
				    System.out.print(arr[j][i]+ " ");
				}	
			}
		}
	}
	
	public static void spiralclock(int[][] arr) {
		int j;
		for(int i=0 ; i<arr.length ; i++) {
			if(i%2==0) {
				for(j=0; j<=arr.length-1 ; j++) {
					System.out.print(arr[j][i]+ " ");
				}	
			}
			else if(i==3) {
				for(j=arr.length-1; j>=0 ; j--) {
				    System.out.print(arr[i][j]+ " ");
				}	
			}
		}
	}
	

}
