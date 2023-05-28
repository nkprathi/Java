package com.demo.datastructures;

import java.util.LinkedHashMap;

public class LinkedHashMapDemo {
	public static void main(String a[])
    {
  
        // An empty LinkedHashMap is created
        LinkedHashMap<Integer, String> lhm  = new LinkedHashMap<Integer, String>();
  
        // Adding entries using put() method
        lhm.put(1, "practice");
        lhm.put(2, "code");
        lhm.put(3, "java");
        lhm.put(4, "in");
        lhm.put(5, "www.java.org");
  
        System.out.println(lhm);
  
        // Note: It prints the elements in same order
        // as they were inserted
  
        // Getting and printing value for a specific key
        System.out.println("Getting value for key 'one': " + lhm.get(2));
  
        // Getting size of Map using size() method
        System.out.println("Size of the map: " + lhm.size());
  
        // Checking whether Map is empty or not
        System.out.println("Is map empty? " + lhm.isEmpty());
  
        // Using containsKey() method to check for a key
        System.out.println("Contains key 3 ? " + lhm.containsKey(3));
  
        // Removing entry using remove() method
        System.out.println("delete element '1': " + lhm.remove(1));
        
        // Using containsKey() method to check for a value
        System.out.println("Contains value 'practice' ? " + lhm.containsValue("practice"));
  
        // Printing mappings to the console
        System.out.println("Mappings of LinkedHashMap : " + lhm);
    }
}
