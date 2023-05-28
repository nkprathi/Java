package com.demo.concurrentDS;


public class DemoFree {
	public String df;
    
    public DemoFree(){
        
        this.df = "Pratheeksha";
    }
 
    public static void main(String[] args)
    {
    	DemoFree name = new DemoFree();	//obj creation
 
        System.out.println("My name is: " + name.df);
        
    }
}


