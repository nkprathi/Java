package com.demo.datastructures;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
	 public static void main(String args[])
	    {
	        // Creating an empty HashSet
	        HashSet<String> set = new HashSet<String>();
	  
	        // Use add() method to add elements into the Set
	        set.add("W");
	        set.add("T");
	        set.add("s");
	        set.add("4");
	        set.add("G");
	        set.add("A");
	        set.add("B");
	        set.add("Z");
	  
	  
	        // Displaying the HashSet
	        System.out.println("HashSet: " + set);
	        System.out.println("Does the Set contains '4'? " + set.contains("4"));
	        System.out.println("The size of the set is: " + set.size());
	        System.out.println("Removes the element:" + set.remove("T"));
	        System.out.println("HashSet: " + set);
	        System.out.println("Is the set empty: " + set.isEmpty());
	        Iterator<String> value = set.iterator();
	        System.out.println("The iterator values are: ");
	        while (value.hasNext()) {
	            System.out.println(value.next());
	        }
	        
	        set.clear();
	        System.out.println("Is the set empty: " + set.isEmpty());
	    
	        
	    }
}
