package p1;

import java.util.Scanner;

public class pattern4  {
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the value ");
		int num = scan.nextInt();
		
		
		for(int i=1;i<=num;i++)
		{
		
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
		System.out.println();
		}
		for( int i= num-2;i>=1;i--)
		{
		
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
		System.out.println();
		
		}
		
    }
	
}


