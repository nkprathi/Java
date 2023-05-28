package com.demo.concurrentDS;

import java.util.concurrent.*;

public class ConcurrentLinkedDequeDemo	{
	public static void main(String[] args)
    {
		ConcurrentLinkedDeque<String> deque = new ConcurrentLinkedDeque<String>();
    
		deque.add(12);
		deque.add(110);

    
		deque.addFirst(55);

		System.out.println("Initial Elements in " + "the LinkedDeque cld : " + deque);
		
    }
}
