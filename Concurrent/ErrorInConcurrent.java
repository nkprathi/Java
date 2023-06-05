package com.may.fifteen.concurrent;
import java.util.ArrayList;
import java.util.Iterator;
  
// Main class
public class ErrorInConcurrent {
	
	  
	    public static void main(String[] args)
	    {
	        ArrayList<Integer> list = new ArrayList<>();
	  
	        list.add(1);
	        list.add(2);
	        list.add(3);
	        list.add(4);
	        list.add(5);
	  
	        Iterator<Integer> iterator = list.iterator();
	  
	        while (iterator.hasNext()) {
	  
	            Integer value = iterator.next();
	  
	            System.out.println("value: " + value);
	  
	            if (value.equals(2)) {
	  
	                System.out.println(
	                    "========================");
	  
	                System.out.println("removing value: "
	                                   + value);
	  
	                System.out.println(
	                    "========================");
	                //list.remove(value);
	                
	            }
	        }
	        list.add(5);
	    }
	}

