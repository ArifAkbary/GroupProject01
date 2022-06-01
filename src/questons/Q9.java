package questons;

public class Q9 {

	public static void main(String[] args) {
		// Find out the Maximum and minimum number in the array?
		
		 //let make array which several  numbers inside;
				
				   // --// Question 9//--//
				
			int [] student= { 1,3,90,8,9,7,7,8,100,120,67,};
			int max=student[0];
			int min=student[0];
			
			// now we can use for each loop;
			for(int number:student) {
				if(max<number)max=number;
				if(min>number)min=number;
			}
			System.out.println("Maximum numbers is " +  max);
			System.out.println("Minimium numbers is " + min);

	}

}
