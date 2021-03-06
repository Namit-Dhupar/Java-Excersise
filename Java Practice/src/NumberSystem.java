
public class NumberSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(BinToDec(1000));//4
//		System.out.println(DecToBin(8));
//		System.out.println(GCD(24,16));
//        System.out.println(LCM(12,18));
//        System.out.println(ReverseNum(856));
		System.out.println(CountFive(85555534));
	}
	
	public static int BinToDec(int bin) {
		int num = bin;
		int dec = 0;
		int temp = num;
		int base = 1; //Starting base is 2^0=1
		while(temp > 0) {
			int last_digit = temp%10; //To get the last digit of binary number
			temp = temp/10; //remove that last digit for the binary number
			dec += last_digit * base;
			base = base*2;
		}
		return (dec); 
	}
	
	public static int DecToBin(int dec) {
		int num = dec;
		int bin = 0;
		int temp = num;
		int base = 1; //Starting base is 2^0=1
		while(temp > 0) {
			int last_digit = temp%2; //To get the last digit of binary number
			temp = temp/2; //remove that last digit for the binary number
			bin += last_digit * base;
			base = base*10;
		}
		return (bin);	
		
	}
	
	public static int GCD(int a, int b) {
		a = (a>0) ? a : -a;
		b = (b>0) ? b : -b;
		while(a != b) {
			if(a>b)
			 a -=b;
			else
			 b -= a;
		}
		return b; //or return a
	}
	
	public static int LCM (int a, int b) {
		return (a*b)/GCD(a,b);
	}
	
	public static int ReverseNum(int num) {
		int rev = 0;
		int remainder;
	  while(num!=0) {
		 remainder = num % 10;
		 rev = rev * 10 + remainder;
		 num /= 10; //Reduce last digit from a number
	  }
	  return rev;
	}
	
	public static int CountFive(int num) {
		int count = 0;
		int remainder;
	  while(num!=0) {
		 remainder = num % 10;
		 if(remainder == 5) {
			 count++;
		 }
		 num /= 10; //Reduce last digit from a number
	  }
	  return count;
	}
}
