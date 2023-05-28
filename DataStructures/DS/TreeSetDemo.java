package com.demo.datastructures;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String args[])
    {
        TreeSet<String> treeset = new TreeSet<String>();
  
        treeset.add("Banana");
        treeset.add("Kiwi");
        treeset.add("Guava");
        treeset.add("Apple");
        treeset.add("Pineapple");
        treeset.add("Orange");
        treeset.add("Lemon");
  
        System.out.println("TreeSet is: " + treeset);
        System.out.println("first element in treeSet is: " + treeset.first());
        treeset.descendingSet();
        System.out.println("TreeSet is: " + treeset);
        System.out.println("Last element deletion " + treeset.pollLast());
        System.out.println("TreeSet is: " + treeset);
        System.out.println("first element deletion " + treeset.pollFirst());
        System.out.println("TreeSet is: " + treeset);
        System.out.println("size of treeset:" + treeset.size());
        treeset.remove("Guava");
        System.out.println("Removing an element " + treeset);




        
    }
}
