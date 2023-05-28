package com.demo.datastructures;

import java.util.HashMap;

public class HashMapDemo {
	
	public static void main(String[] args)
    {
        HashMap<String, Integer> hm1 = new HashMap<>();
        //HashMap<Integer, String> hm2 = new HashMap<>();
        
        hm1.put("vishal", 10);
        hm1.put("sachin", 30);
        hm1.put("vaibhav", 20);
  
        System.out.println("Size of map is: " + hm1.size());
        System.out.println("Mapping of HashMap hm1 are : " +hm1);
  
        if (hm1.containsKey("vishal")) {
            Integer a = hm1.get("vishal");
            System.out.println("value for key" + " \"vishal\" is: " + a);
        }
        System.out.println("Initial Map " + hm1);
        
        hm1.put("For", 2);
        System.out.println("Updated Map " + hm1);
        
        hm1.remove("vaibhav");
        System.out.println("Mappings after removal are : " + hm1);
        
        System.out.println("Is the key \"vishal\" present? " + hm1.containsKey("vishal"));
        
        System.out.println("Is the value 30 present? " + hm1.containsValue(30));
        
        System.out.println("The Value is: " + hm1.get("vishal"));
        
        String por=hm1.toString();
        System.out.println(por);
        
        hm1.replace("vishal", 10, 100);
        System.out.println(hm1);
        
        hm1.clear();
        System.out.println("Finally the maps look like this: " + hm1);
        
        
        /*hm2.put(5, "Abhi");
        hm2.put(15,"Amor");
        hm2.put(18,"Bhanu");
        hm2.put(20,"Bhanu");
        
        System.out.println("Size of map is: " + hm2.size());
  
        System.out.println("Mapping of HashMap hm2 are : " + hm2);*/
    }
}
