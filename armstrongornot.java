package p1;

import java.util.Scanner;

public class armstrongornot {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number");
		int number = sc.nextInt();
		
		
		 int original=number;
		int temp=number;
		int sum=0;
		
		while(temp>0)
		{
			int digit = temp %10;
			
			sum = sum +(digit*digit*digit);
			
			temp=temp/10;
			number = number/10;
			
			
			 if (sum == original) {
		            System.out.println(original + " is an Armstrong number");
		        } 
			 else {
		            System.out.println(original + " is not an Armstrong number");
		        }
			
			
			
		}
		
		
	}

}
