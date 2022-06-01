package questons;

public class Q6 {

	public static void main(String[] args) {
		//Write a program to swap 2 numbers without a temporary variable?
		
		int x =100;
		int y=500;
		
		x=x+y;
		//  x is now equals to 6;
		
		y=x-y;//  now the value of y become 5
		x=x-y;// now the value of x become one 

		System.out.println(x);
		System.out.println(y);
		

	}

}
