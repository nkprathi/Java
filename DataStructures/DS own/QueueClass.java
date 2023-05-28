package com.may.tweenty.queue;

import java.util.NoSuchElementException;

public class QueueClass {

	
		
		Node headnode;
		
		public void add (String cityname) {
			Node newnode = new Node();
			newnode.setValue(cityname);
			if (headnode==null) {
				headnode=newnode;
			}
			else {
				Node currentnode=headnode;
				
				while(currentnode.getNextnode()!=null) {
					currentnode=currentnode.getNextnode();
				}
				currentnode.setNextnode(newnode);
			}
		}
		public boolean search (String cityname)
		{
				Node currentNode=headnode;
				boolean matchFound = false;
				
				while(currentNode != null && !matchFound) {
					if(currentNode.getValue().equals(cityname)){
						matchFound=true;
						System.out.println("Match found");
					}
					
					currentNode = currentNode.getNextnode();
				}
				if(!matchFound) {
				   System.out.println("Not found");
				}
				return matchFound;
			
		}
		public boolean search2 (String cityname)
		{
			Node currentNode=headnode;
							
			while(currentNode != null ) {
				if(currentNode.getValue().equals(cityname)){
					return true;
				}
				currentNode = currentNode.getNextnode();
			}
			return false;
		}
		
		public Node poll() {
			// TODO Auto-generated method stub
			Node currentNode=headnode;
			if(headnode!=null) {
				headnode=headnode.getNextnode();
				return currentNode;
			}
			return null;
		}
		
		public Node remove2() {
			// TODO Auto-generated method stub
			Node currentNode=headnode;
			if(headnode!=null) {
				headnode=headnode.getNextnode();
				return currentNode;
			}
			else {
				throw new NoSuchElementException() ;
			}
		}
		
		public void remove() {
			// TODO Auto-generated method stub
			headnode=headnode.getNextnode();
			System.out.println("Removed headnode");
		}
		
		
		public void print() {
			Node currentnode = headnode;
			
			while (currentnode != null) {
				System.out.println(currentnode.getValue());
				currentnode=currentnode.getNextnode();
			}
		}
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
				
			QueueClass q= new QueueClass();
				q.add("delhi");
				q.add("Losangles");
				q.add("Paris");
				q.add("Tokyo");
				q.print();
				
				System.out.println("--------");
				
				//q.search("pkd");
				//q.print();
				
				//System.out.println("--------");
				
				//q.remove();
				/*Node temp=q.poll();
				temp=q.poll();
				temp=q.poll();
				temp=q.poll();
				temp=q.poll();*/
				
				q.remove2();
				q.remove2();
				q.remove2();
				q.remove2();
				q.remove2();
				
				//System.out.println(temp.getValue());
				System.out.println("--------");
				q.print();
				/*sl.print();
				
				
				sl.print();
				System.out.println("--------");
				
				System.out.println("--------");
				
				sl.print();
				
				/*
				sl.print();
				sl.delete("Paris");
				sl.print();
				sl.insert("London","Losangles");
				sl.print();*/
			
		
		}
}
