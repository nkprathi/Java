package com.demo.datastructures;

import java.util.Map;
import java.util.WeakHashMap;

public class WeakHashMapDemo {
	public static void main(String[] arg)
    {
  
        Map<Number, String> weakhm = new WeakHashMap<Number, String>();
  
        // Inserting custom elements
        // using put() method
        weakhm.put(1, "Karthik");
        weakhm.put(2, "Prathi");
        weakhm.put(3, "Rahul");
        weakhm.put(4, "Maha");
        weakhm.put(5, "Priya");
        weakhm.put(6, "Rpk");
  
        // Printing and alongside checking weak map
        System.out.println("our weak map: " + weakhm);
        System.out.println("using get method:" + weakhm.get(3));
        weakhm.put(7, "Nithiya");
        System.out.println("our weak map: " + weakhm);
        System.out.println("size of weak map: " + weakhm.size());
        System.out.println("keys of weak map: " + weakhm.keySet());
        System.out.println("values of weak map: " + weakhm.values());
        
        weakhm.remove(6, "Rpk");
        System.out.println("After removing: " + weakhm);
        
        weakhm.remove(5);
        System.out.println("After removing: " + weakhm);





    }
}
