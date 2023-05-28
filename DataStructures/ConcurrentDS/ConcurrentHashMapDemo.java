package com.demo.concurrentDS;


import java.util.concurrent.ConcurrentHashMap;


public class ConcurrentHashMapDemo {
	public static void main(String[] args)
    {
        ConcurrentHashMap<String, Integer> chmap = new ConcurrentHashMap<String, Integer>();
         
        chmap.put("1", 1);
        chmap.put("2", 2);
        chmap.put("3", 3);
        chmap.put("4", 4);
        chmap.put("5", 5);
        chmap.put("6", 6);
        chmap.put("7", 7);
        chmap.put("8", 8);
        chmap.put("9", 9);
        chmap.put("10", 10);
        System.out.println("Mappings of chmap : " + chmap);
        
        chmap.remove("10");
        System.out.println("Mappings of chmap : " + chmap);
        
        chmap.remove("6", 6);
        System.out.println("Mappings of chmap : " + chmap);
        
        chmap.replace("7", 11);
        System.out.println("Mappings of chmap : " + chmap);
        
        chmap.replace("5", 5, 10);
        System.out.println("Mappings of chmap : " + chmap);
        
        System.out.println("The Value associated to " + "7 is : " + chmap.get("7"));
        
        System.out.println("The set is: "+ chmap.keySet());
 

    }
}
