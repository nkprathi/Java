package com.may.tweenty.classdemo;

public class SingleLinkedList {
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
	public void search (String cityname)
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
		
	}
	public void delete (String cityname) {

		if(headnode.getValue().equals(cityname)) {
			headnode=headnode.getNextnode();
		}
		else {
			Node currentNode = headnode;
			Node Previousnode = null;
			boolean matchFound = false;
			while(currentNode != null && !matchFound) {

				if(currentNode.getValue().equals(cityname)){
					matchFound=true;
					System.out.println("Match found");
					Previousnode.setNextnode(currentNode.getNextnode());
				}
				Previousnode=currentNode;
				currentNode=currentNode.getNextnode();
			}
		}
		/*if(!matchFound) {
		   System.out.println("Not found");
		}*/
	}
	
	public void insert (String cityname, String aftercityname) {
		Node newNode = new Node();
		Node currentNode=headnode;
		boolean matchfound = false;
		
		while(currentNode!= null && !matchfound) {
			if (currentNode.getValue().equals(aftercityname)) {
				newNode.setNextnode(currentNode.getNextnode());
				currentNode.setNextnode(newNode);
				newNode.setValue(cityname);
				matchfound=true;
				System.out.println("Inserted");
			}
			currentNode = currentNode.getNextnode();
		}
		if(!matchfound) {
		   System.out.println("Not Inserted");
		}		
	}
	
	public void print() {
		Node currentnode = headnode;
		
		while (currentnode != null) {
			System.out.println(currentnode.getValue());
			currentnode=currentnode.getNextnode();
		}
	}
	public void archive() {
		Node headnode= new Node();
		headnode.setValue("Mumbai");
		
		Node secondnode = new Node();
		secondnode.setValue("Chennai");
		headnode.setNextnode(secondnode);
		
		Node thirdnode = new Node();
		thirdnode.setValue("Coimbatore");
		secondnode.setNextnode(thirdnode);
		
		Node fourthnode = new Node();
		fourthnode.setValue("Trichy");
		thirdnode.setNextnode(fourthnode);
		
		Node obj = headnode;
		
		while (obj != null) {
			System.out.println(obj.getValue());
			obj=obj.getNextnode();
		}
		/*System.out.println(obj.getValue());
		System.out.println(obj.getNextnode().getValue());
		System.out.println(obj.getNextnode().getNextnode().getValue());
		System.out.println(obj.getNextnode().getNextnode().getNextnode().getValue());

		/*int i = 0;
		while (i < 4) {
			System.out.println(obj.getValue());
			obj=headnode.getNextnode();
			i++;
		}*/
	}
	public static void main(String[] args) {
		
		SingleLinkedList sl= new SingleLinkedList();
		sl.add("delhi");
		sl.print();
		System.out.println("--------");
		sl.add("Losangles");
		sl.print();
		System.out.println("--------");
		sl.add("Paris");
		sl.print();
		System.out.println("--------");
		sl.search("pkd");
		sl.print();
		System.out.println("--------");
		sl.delete("delhi");
		sl.print();
		sl.insert("chennai","Paris");
		/*sl.add("Tokyo");
		sl.print();
		sl.delete("Paris");
		sl.print();
		sl.insert("London","Losangles");
		sl.print();*/
	}
	
}

