//Print the following table for Fahrenheit to
//Celsius using Formula C = (5/9)(F – 32) 
public class CelsiusToFahre {

	public static void main(String[] args) {
		int f,f1=0;
		double c,c1=0;
		for (int i=0 ; i<=6 ; i++) {
			f=20*i;
			c=0.55 * (f-32);
			int cel = (int) c;
			System.out.println(f + "\t" + cel);
	   }
	   for(int j=7 ; j<=15 ; j++) {
		  f1 = 20*j;
		  c1 = 0.55 * (f1-32);
		  double cel1 = Math.ceil(c1);
		  int cels = (int) cel1;
		  System.out.println(f1+ "\t" + cels);
	  }	

   }
}
