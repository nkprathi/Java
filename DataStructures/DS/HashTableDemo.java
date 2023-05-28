package com.demo.datastructures;

import java.util.Hashtable;
import java.util.Map.Entry;

public class HashTableDemo {
	public static void main(String args[])
    {
        Hashtable<Integer, String> ht1 = new Hashtable<>(4);
 
        // Inserting the Elements using put() method
        ht1.put(1, "one");
        ht1.put(2, "two");
        ht1.put(3, "three");
        ht1.put(4, "four");
        ht1.put(5, "five");
        ht1.put(6, "six");
        
        //size of the map
        System.out.println("Size of map is:- " + ht1.size());
        // Print mappings to the console
        System.out.println("Mappings of ht1 : " + ht1);
        
        // Check if a key is present and if present, print value
        if (ht1.containsKey(4)) {
            String a = ht1.get(4);
            System.out.println("value for key" + " \"4\" is:- " + a);
        }
        // Check if a value is present and if present, return true
        System.out.println("Is the value 'five' present? " + ht1.containsValue("five"));
        
        // Remove the map entry with key 4
        ht1.remove(3);
        // Final Hashtable
        System.out.println("Updated map : " + ht1);
        
        // Iterating using enhanced for loop
        for (Entry<Integer, String> e : ht1.entrySet()) {
            System.out.println(e.getKey() + " " + e.getValue());
        }
        System.out.println(ht1.toString());
    }
}
