package p1;

import java.util.Scanner;

public class patternprogram2 {

	public static void main(String[] args) {
		
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Enter the rows");
	int rows=scan.nextByte();
	
	    for(int i=1;i<=rows;i++)
	    {
	    	
	        for(int j=0;j<=i;j++)
	        {
	        	if ((i + j) % 2 == 0)
                    System.out.print("1");
                else
                    System.out.print("0");
	        }
	        
	        System.out.println();
	    }

	}

}
