package questons;

public class Q10 {

	public static void main(String[] args) {
	
		// Write a java program to find the second largest number in the array?

		int[] arif = { 1, 3, 5, 8, 9, 12, 35, 67, 87, 65, 32, 65, 87, 98, 56, 32, 35, 6, 7, 8, 97 };

		int max = 0;
		int secandMax = 0;
		for (int i = 0; i < arif.length; i++) {
			int element = arif[i];
			if (element > max) {
				secandMax = max;
				max = element;

			} else if (element > secandMax && element != max) {
				secandMax = element;
			}
		}
		System.out.println("Maximium number is " + max);
		System.out.println("secand large number is " + secandMax);

	}

}
