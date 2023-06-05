package com.may.fifteen.Reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
	  
public class CGGF {
	 public void printMessage(String message)
	 {
	    System.out.println(
	            "you invoked me with the message:" + message);
	 }
	  
	 public void addMe(int num1, int num2)
	 {
	        System.out.println("sum is:" + (num1 + num2));
	 }
	  
	    public static void main(String[] args) throws Exception
	    {
	    System.out.println("Find method by Name in Java using Reflection!");
	        
	        // create class object to get its details
	    CGGF obj = new CGGF();
	        
	    Class<? extends CGGF> classObj = obj.getClass();
	  
	        // get all methods in the class
	    Method[] allMethods = classObj.getDeclaredMethods();
	  
	        // loop through the methods to find the method addMe
	    for (Method m : allMethods) {
	            
	        String methodName = m.getName();
	        if (methodName.equals("addMe")) {
	            try {
	                    
	                    // invoke the method directly with its
	                    // parameters
	               m.invoke(obj, 10, 20);
	            }
	            catch (InvocationTargetException e) {
	            }
	        
	        }
	    }
	}
}
