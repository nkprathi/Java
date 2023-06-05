package com.may.tweenty.classdemo;

//self Referencial Structure

public class Node {
	
	
	String value;
	Node nextnode;
	
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public Node getNextnode() {
		return nextnode;
	}
	public void setNextnode(Node nextnode) {
		this.nextnode = nextnode;
	}
}
