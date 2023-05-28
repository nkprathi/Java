package com.demo.datastructures;

import java.util.LinkedList;

public class LinkedListDemo	{
	public static void main(String args[])
    {
        LinkedList<String> ll = new LinkedList<String>();
        
        // Adding elements to the linked list
        ll.add("A");
        ll.add("B");
        ll.addLast("C");
        ll.addFirst("D");
        ll.add(2, "E");
        ll.add("F");
        ll.addFirst("G");
        ll.addLast("H");
        ll.add(5, "E");
        ll.add(4, "G");
 
        System.out.println(ll);
        System.out.println(ll.poll());//states the first element of the list

        System.out.println("Head of the list : " + ll.peek());
        System.out.println("Head of the list : " + ll.peekFirst());
        System.out.println("Last element of the list is : " + ll.peekLast());
        System.out.println("Element at index 3 is : "+ ll.get(1));
        System.out.println("Element at 1st index is : "+ ll.getFirst());
        System.out.println("Element at last index is : "+ ll.getLast());
        
        ll.offer("Astha");
        System.out.println("LinkedList after insertion using offer() : " + ll);
        
        ll.offerFirst("Abhi");
        System.out.println("LinkedList after insertion using offerFirst() : " + ll);
        
        ll.offerLast("Barghav");
        System.out.println("LinkedList after insertion using offerLast() : " + ll);
        
        System.out.println("Index of 1st occurrence of Astha : " + ll.indexOf("Astha"));
        System.out.println("Index of last occurrence of Astha : "+ ll.lastIndexOf("Astha"));
        
        
        System.out.println("------------");
        System.out.println("LinkedList after insertion using offerLast() : " + ll);
        
        ll.remove(9);
        ll.remove("Astha");
        ll.removeFirst();
        ll.removeFirstOccurrence("E");
        ll.removeLast();
        ll.removeLastOccurrence("G");
        System.out.println("Modified LinkedList : " + ll);

        
    }
}
