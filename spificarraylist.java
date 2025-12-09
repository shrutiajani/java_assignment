package p1;

import java.util.*;

public class spificarraylist {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Red");
        list.add("Green");
        list.add("Blue");

        list.set(1, "Yellow"); 
        System.out.println(list);
    }
}
