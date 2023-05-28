package com.demo.datastructures;
import java.util.ArrayList;
import java.util.List;
	  
public class ArrayListDemo {
	public static void main(String[] args)
	    {
			List<Integer> arrlist = new ArrayList<Integer>(10);
	          
	        arrlist.add(15);
	        arrlist.add(20);
	        arrlist.add(25);
	        arrlist.add(30);
	        arrlist.add(35);
	        
	        System.out.println("List is " + arrlist);
	        
	        arrlist.remove(2);
	        arrlist.remove(1);
	        
	        System.out.println("List is " + arrlist);

	        arrlist.add(3, 65);
	        arrlist.add(4, 83);
	        arrlist.add(5, 95);
	        arrlist.add(6, 150);
	        	        
	        int size = arrlist.size();
	        System.out.println("Size of list = " + size);
	        System.out.println("List is " + arrlist);
	        
	        Integer[] arr = new Integer[arrlist.size()];
	        arr = arrlist.toArray(arr);
	  
	        for (Integer x : arr)
	            System.out.println(x);
	    }
	}

