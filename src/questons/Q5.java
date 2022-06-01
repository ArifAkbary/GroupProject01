package questons;

public class Q5 {

	public static void main(String[] args) {
		// Create a 2D array of integers. Develop a program which will calculate the
				//sum of  even and odd numbers for that array.
				int sumEven=0;
				int sumOdd=0;
				int [][] x= {{12,35,78,67},{35,65,89,0},{3,6,8,9} } ;
				for(int i=0; i<x.length; i++) {
					for(int j=0; j<x[i].length; j++) {
						if(x[i][j]%2==0) {
							sumEven+=x[i][j];
						}else {
							sumOdd+=x[i][j];
						}
						
					}
					
				}
				System.out.println("Sum of even numbers are "+ sumEven);
				System.out.println("Sum of odd numbers are "+ sumOdd);
	

	}

}
