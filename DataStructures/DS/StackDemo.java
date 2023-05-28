package com.demo.datastructures;

import java.util.Stack;

	public class StackDemo {
		    public static void main(String args[])
		    {
		    	Stack<String> stack = new Stack<String>();
		    	 
		        stack.push("Welcome");
		        stack.push("To");
		        stack.push("Java");
		        stack.push("Programming");
		        stack.push("Section");
		        stack.push("Java");
		 
		        System.out.println("Initial Stack: " + stack);
		 
		        System.out.println("The element at the top of the" + " stack is: " + stack.peek());
		        
		        System.out.println("Popped element: " +stack.pop());
		        System.out.println("Popped element: " +stack.pop());
		        System.out.println("The element at the top of the" + " stack is: " + stack.peek());
		        stack.push("1254");
		        stack.push("4521");
		       
		        System.out.println("Does the stack contains 'Java'? "+stack.search("Java"));
		        
		        System.out.println("The element is: "+ stack.elementAt(1));
		        
		        System.out.println("The first occurrence of Java is at index:" + stack.indexOf("Java"));
		        	        
		        System.out.println("The last element is: " + stack.lastElement());
		        
		        String removed = stack.remove(4);
		        
		        System.out.println("Removed element: " + removed);
		  
		        System.out.println("Final Stack: " + stack);
		        
		        System.out.println("Is the stack empty? " + stack.empty());
		        System.out.println("Final Stack: " + stack);
		    }
		
	}

