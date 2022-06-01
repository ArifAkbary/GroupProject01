package questons;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//Create a 2D array of integer values. Print the sum of all numbers.	
		
		int[][] num = {
		        {20, 9, 5},
		        {5, 7, 18},
		        {8, 10, 7}
		};
		int sum = 0;
		for (int i = 0; i < num.length; i++) {
		    for (int j = 0; j < num[i].length; j++) {
		        sum += num[i][j];
		    }
		}
		System.out.println(sum);
		
		
	}

}
