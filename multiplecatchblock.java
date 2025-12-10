package p1;

public class multiplecatchblock {

	public static void main(String[] args) {
		
		
		
		        try {
		            int a[] = new int[3];
		            a[5] = 20; 
		        }
		        catch (ArrayIndexOutOfBoundsException e) {
		            System.out.println("Array index error");
		        }
		        catch (Exception e) {
		            System.out.println("Other Exception");
		        }
		    }
		}

	


