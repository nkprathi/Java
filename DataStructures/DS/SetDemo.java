package com.demo.datastructures;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
	    public static void main(String args[])
		{
		        // Creating an empty Set
		 	Set<String> s = new HashSet<String>();
		  
			s.add("Failure");
		   	s.add("is");
		   	s.add("success");
		  	s.add("if");
		  	s.add("we");
		   	s.add("learn");
		   	s.add("from");
		  	s.add("it");
		        
			System.out.println("The size of the set is: " + s.size());
		        
		 	String check = "it";
		        
		  	System.out.println("Contains " + " \" "+ check + " \" "+":"+ s.contains(check));
		        
		 	s.remove("from");
			s.remove("if");
		        
		   	System.out.println("Set: " + s);
		   	for (String value : s)
		        	  
		            // Printing all the values inside the object 
		  	System.out.print(value + ", ");
		          
			System.out.println();
		}
		
}
