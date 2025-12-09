package p1;

import java.util.Scanner;

public class fibonaciseries {

	public static void main(String[] args) {
		
	
		        Scanner scan = new Scanner(System.in);

		    
		        System.out.println("Enter the value:");
		        int n = scan.nextInt();
		        
		        int a = 0,b=1,c;

		      
		        
		        System.out.println("Fibonacci series:"+a+""+b+"");

		     
		        
		        for(int i=2;i<n;i++)
		        {
		        	
		        	c=a+b;
		        	System.out.print(c+"");
		        	a=b;
		        	b=c;
		        }
		        
		    
		
	}
}

	


