package com.may.tweenty.queue;


public class Stack {

	Node tailnode;
	 
	public void add (String cityname) {
		Node newnode = new Node();
		newnode.setValue(cityname);
		
		if(tailnode==null) {
			tailnode=newnode;
		}
		else {
			newnode.setNextnode(tailnode);
			tailnode=newnode;
			
		}
		
	}
	
	public int count() {
		int count = 0;
		Node currentNode=tailnode;
		if(tailnode==null) {
			System.out.println("The Number of Elements in the stack is:" + count);
			
		}
		else {
			while(currentNode!=null) {
				currentNode=currentNode.getNextnode();
				count++;
			}
			System.out.println("The Number of Elements in the Stack is:" + count);
			
		}
		return count ;
	}

	/*public void remove() {
		// TODO Auto-generated method stub
		headnode=headnode.getNextnode();
		System.out.println("Removed headnode");
		
	}*/
	
	public void print() {
		Node currentnode = tailnode;
		
		while (currentnode != null) {
			System.out.println(currentnode.getValue());
			currentnode=currentnode.getNextnode();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Stack sk= new Stack();
		sk.add("delhi");
		sk.add("Losangles");
		sk.add("Paris");
		sk.add("Tokyo");
		sk.print();
		sk.count();
		System.out.println("--------");
		
	}
}
			

	/*public void remove() {
		// TODO Auto-generated method stub
		headnode=headnode.getNextnode();
		System.out.println("Removed headnode");
		
	}
	
	public int count() {
		return ;
	}*/

