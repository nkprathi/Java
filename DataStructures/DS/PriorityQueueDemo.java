package com.demo.datastructures;

import java.util.PriorityQueue;

public class PriorityQueueDemo {
	 public static void main(String args[])
	    {
	        // Creating an empty PriorityQueue
	        PriorityQueue<String> pq = new PriorityQueue<String>();
	  
	        pq.add("Welcome");
	        pq.add("To");
	        pq.add("Java");
	        pq.add("Programming");
	        pq.add("World");
	  
	        System.out.println("PriorityQueue: " + pq);
	        
	        System.out.println("---------------");

	        
	        pq.remove("Welcome");
	        
	        System.out.println("PriorityQueue: " + pq);
	        
	        System.out.println("Queue's head: " + pq.peek());
	        
	        System.out.println(pq.toString());
	        
	        System.out.println("Queue's head: " + pq.poll());



	    }
}