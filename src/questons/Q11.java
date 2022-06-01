package questons;

public class Q11 {

	public static void main(String[] args) {
		//Write a program to print out duplicate 
		//elements from an Array of Strings?
		
		String[] Storge= {"Book","Phone","Phone","Key","luck","Phone","Flowers","Key","Pin"};
		
		for(int i=0; i<Storge.length; i++) {
			for(int j=i+1; j<Storge.length; j++) {
				if(Storge[i]== Storge[j]) {
					System.out.println(Storge[i]);
				}
			}
		}


	}

}
