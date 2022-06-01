package questons;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		// Using of a scanner to create array of counters and capital. 
		 
		
	    try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Please enter how many counties you want to store inside array: ");
			int size=scan.nextInt();
			String[] counties=new String[size];
			for(int i=0; i<counties.length; i++) {
			    System.out.println("Please enter your country");
			    counties[i]=scan.next();
			}
			String capital=null;
			for (String a:counties) {
			    if(a.equalsIgnoreCase("Afghanistan")){
			    capital="Kabul";}
			    if(a.equalsIgnoreCase("Pakistan")){
			        capital="Islam Abad";
			    }if(a.equalsIgnoreCase("Uzbekistan")){
			        capital="Tashkent";
			    }if(a.equalsIgnoreCase("France")){
			        capital="Paris";
			    }
			    System.out.println(a+"'s capital is "+capital+".");
			}
		}

	}

}
