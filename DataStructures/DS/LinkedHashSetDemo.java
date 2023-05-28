package com.demo.datastructures;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
	public static void main(String[] args)
    {
 
        LinkedHashSet<String> linkedset = new LinkedHashSet<String>();
 
        linkedset.add("A");
        linkedset.add("B");
        linkedset.add("C");
        linkedset.add("D");
        linkedset.add("A");
        linkedset.add("E");
 
        // size of LinkedHashSet using size() method
        System.out.println("Size of LinkedHashSet = " + linkedset.size());
        System.out.println("Original LinkedHashSet:" + linkedset);
 
        // Removing existing entry from above Set using remove() method
        System.out.println("Removing D from LinkedHashSet: " + linkedset.remove("D"));
        System.out.println("Original LinkedHashSet:" + linkedset);
 
        // Removing existing entry from above Set that does not exist in Set
        System.out.println("Trying to Remove Z which is not " + "present: " + linkedset.remove("Z"));
 
        // Checking for element whether it is present inside Set or not using contains() method
        System.out.println("Checking if A is present=" + linkedset.contains("A"));
 
        System.out.println("Updated LinkedHashSet: " + linkedset);
        System.out.println(linkedset.toString());
        
        
        linkedset.clear();
        System.out.println("The final set: " + linkedset);
    }
}
