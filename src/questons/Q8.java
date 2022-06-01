package questons;

public class Q8 {

	public static void main(String[] args) {
		//Write a Java Program to print the first 
				//10 numbers of Fibonacci series.
				
				//Question # 8;
				
				int a;
				int b;
				int c;
				
				a=0;
			    b=1;
			    
			    for (int i=1; i<=10; i++){
			    	c=a+b; 
			    	a=b; 
			    	b=c;
			    	System.out.print(a+" , ");
			    	
			    	
			    }
				
				
				

	}

}
