package p1;

import java.util.Scanner;

public class printgreatestnumber {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter first number");
		int fnum=scan.nextInt();
		
		System.out.println("Enter Second number");
		int snum=scan.nextInt();
		
		System.out.println("Enter Third number");
		int tnum=scan.nextInt();

		
		 int greatest;
		 if (fnum >=snum && fnum >= tnum) {
	            greatest = fnum;
	        } else if (snum >= snum && snum >= tnum) {
	            greatest = snum;
	        } else {
	            greatest = tnum;
	        }
		 
		 System.out.println("The greatest number is: " + greatest);
	}

}
