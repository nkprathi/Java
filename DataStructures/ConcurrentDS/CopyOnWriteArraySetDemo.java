package com.demo.concurrentDS;

import java.util.concurrent.CopyOnWriteArraySet;

public class CopyOnWriteArraySetDemo {
	public static void main(String[] args)
    {
  
        // create object of CopyOnWriteArraySet
        CopyOnWriteArraySet<Integer> ArrSet = new CopyOnWriteArraySet<Integer>();
  
        // Add elements
        ArrSet.add(2);
        ArrSet.add(3);
        ArrSet.add(4);
        ArrSet.add(7);
        ArrSet.add(8);
        ArrSet.add(30);
        ArrSet.add(42);
        ArrSet.add(75);
  
        // print CopyOnWriteArraySet
        System.out.println("CopyOnWriteArraySet: " + ArrSet);
  
        // 4 is already present hence cannot add
        System.out.println("On adding 4 it returns " + ArrSet.add(5));
     
        ArrSet.remove(7);
        System.out.println("Updated CopyOnWriteArraySet: " + ArrSet);
        
        System.out.println("size of ArrSet: "+ ArrSet.size());
    }
}
