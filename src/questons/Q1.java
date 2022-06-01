package questons;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Using Scanner create an array of integer values. After the array is created,
		//calculate the sum of all stored elements in that array.
		
		try (Scanner input = new Scanner(System.in)) {
			int sum = 0;
			System.out.println("How many numbers you want to enter: ");
			int numsize = input.nextInt();
			int[] numbers = new int[numsize];
			for (int i = 0; i < numsize; i++) {
			    System.out.println("enter the number");
			    numbers[i] = input.nextInt();
			    sum += numbers[i];
			}
			System.out.println("The sum of all " + numsize + " numbers are =" + sum);
		}	

	}

}
