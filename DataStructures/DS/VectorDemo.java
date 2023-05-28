package com.demo.datastructures;

import java.util.Vector;

public class VectorDemo {
	public static void main(String args[])
    {
 
        Vector<String> vt = new Vector<String>();
 
        vt.add("We");
        vt.add("20");
        vt.add("of");
        vt.add("Us");
        vt.add("They");
        vt.add("18");
        vt.add("of");
        vt.add("Them");
 
        System.out.println("The vector is: " + vt);
 
        vt.add(0,"Last");
        vt.add(2,"Latest");
        System.out.println("The new Vector is: " + vt);
        
        System.out.println("Capacity of the vector:" + vt.capacity());
        System.out.println("size of the vector:" + vt.size());
        System.out.println("First element: " + vt.firstElement());
        System.out.println("Last element: " + vt.lastElement());
        System.out.println("Element at 4: " + vt.get(4));
        System.out.println("The new Vector is: " + vt.indexOf("Them"));
        vt.insertElementAt("Prathi", 9);
        System.out.println("The new Vector is: " + vt);



        



        System.out.println("Element at index 5 is:"+ vt.elementAt(5));
 
        
    }
}
