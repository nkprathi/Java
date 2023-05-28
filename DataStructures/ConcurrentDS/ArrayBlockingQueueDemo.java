package com.demo.concurrentDS;
import java.util.concurrent.ArrayBlockingQueue;
public class ArrayBlockingQueueDemo {
	public static void main(String[] args) throws InterruptedException
    {
        // define capacity of ArrayBlockingQueue
        int capacity = 15;
  
        // create object of ArrayBlockingQueue
        ArrayBlockingQueue<String> abq = new ArrayBlockingQueue<String>(capacity);
  
        // add  numbers
        abq.add("Myth");
        abq.add("Prathi");
        abq.add("Maha");
        abq.add("Manjari");
        abq.add("Priya");
        abq.add("Krithika");
        abq.add("Karthik");
        abq.add("Adi");
        abq.add("Nithish");
        abq.add("Rahul");
        abq.add("Raja");
        System.out.println("ArrayBlockingQueue:" + abq);
        
        abq.put("KKKKL");//throws InterruptedException
        System.out.println("ArrayBlockingQueue:" + abq);
        
        abq.remove("Nithish");
        System.out.println("ArrayBlockingQueue:" + abq);
        
        System.out.println("Head of queue: " + abq.peek());//only shows the first element
        System.out.println("Head of queue: " + abq.poll());//removes the first element by showing up
        System.out.println("ArrayBlockingQueue:" + abq);
        
        System.out.println("Size of queue: " + abq.size());
        System.out.println("First Element: " + abq.take());



    }
}
