package com.may.fifteen.Reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
	  
public class GFG {
	 public void printDemo(String message)
	    {
	        System.out.println("you invoked me with the message:" + message);
	    }
	    
	    public static void main(String[] args) throws Exception
	    {
	        System.out.println("com.may.fifteen.Reflection.CFG");
	        
	        // create class object to get its details
	        GFG obj = new GFG();
	        
	        Class<?> classObj = obj.getClass();
	  
	        // get method object for "printMessage" function by
	        // name
	        Method printMessage = classObj.getDeclaredMethod("printDemo", String.class);
	        obj.printDemo ("hello123");
	        try {
	            
	            // invoke the function using this class obj
	            // pass in the class object
	            printMessage.invoke(obj, "hello"); 
	        }
	        
	        catch (InvocationTargetException e) 
	        {
	            System.out.println(e.getCause());
	        }
	    }
	
}
