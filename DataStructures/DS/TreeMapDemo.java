package com.demo.datastructures;

import java.util.TreeMap;

public class TreeMapDemo {
	 
	public class Main {
	    public static void main(String[] args) {
	    	TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();
 
	    	treeMap.put(10, "Geeks");
	    	treeMap.put(15, "4");
	    	treeMap.put(20, "Geeks");
	    	treeMap.put(25, "Welcomes");
	    	treeMap.put(30, "You");
 
	    	System.out.println("TreeMap: " + treeMap);
	    }
	}
}
}
