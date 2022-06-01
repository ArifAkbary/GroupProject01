package questons;

public class Q4 {

	public static void main(String[] args) {
		//Create a 2D array or integer type where you will
		//store odd and even numbers. Develop a program which will 
		//identify/print the even numbers only.
		
		int [][]num= { {5,4,9},{3,8,9}, {12,9,2}  };
		
		for(int i=0; i<num.length; i++) {
			for(int j=0; j<num[i].length; j++) {
				if(num[i][j]%2==0) {
					System.out.print(num [i][j]+" ");
				}
			}
		}
		
		
		

	}

}
