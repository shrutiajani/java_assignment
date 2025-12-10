package p1;

	import java.util.*;

	public class Removeelement {
	    public static void main(String[] args) {
	        ArrayList<String> list = new ArrayList<>();
	        list.add("A");
	        list.add("B");
	        list.add("C");
	        list.add("D");

	        list.remove(2);  // index start from 0
	        System.out.println(list);
	    }
	}



