package com.demo.concurrentDS;

import java.util.concurrent.CopyOnWriteArrayList;
public class CopyOnWriteArrayListDemo {

	public static void main(String[] args)
    {
        // creating object of CopyOnWriteArrayList
        CopyOnWriteArrayList<Integer> copyArrLis = new CopyOnWriteArrayList<Integer>();
  
        copyArrLis.add(2);
        copyArrLis.add(3);
        copyArrLis.add(4);
        copyArrLis.add(7);
        copyArrLis.add(2, 7);
        copyArrLis.add(1, 4);
        copyArrLis.addIfAbsent(10);
  
        System.out.println("CopyOnWriteArrayList: " + copyArrLis);
        System.out.println("On adding 45 it returns " + copyArrLis.add(45));
        System.out.println("CopyOnWriteArrayList: " + copyArrLis);
        System.out.println("Does list have 7? " + copyArrLis.contains(7));
        System.out.println("Does list have 20? " + copyArrLis.contains(20));
        System.out.println("Element at 2nd index: " + copyArrLis.get(2));
        System.out.println("indexOf value: " + copyArrLis.indexOf(4));
        // first occurrence of 7 from 2nd index
        System.out.println("indexOf value: " + copyArrLis.indexOf(7, 2));
        // last occurrence of 7
        System.out.println("lastIndexOf value: " + copyArrLis.lastIndexOf(7));
        // last occurrence of 7 from 6th index
        System.out.println("lastIndexOf Value: " + copyArrLis.lastIndexOf(7, 6));
        copyArrLis.remove(5);
        System.out.println("CopyOnWriteArrayList: " + copyArrLis);
        }
}

