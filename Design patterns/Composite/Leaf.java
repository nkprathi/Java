package com.may.fifteen.composite;


interface Component
{
	void showPrice();
}
public class Leaf implements Component{
	int price;
	String name;
	
	@Override
	public void showPrice() {
		// TODO Auto-generated method stub
		System.out.println(name+ " : " + price);
	}
	public Leaf(int price, String name) {
		super();
		this.price = price;
		this.name = name;
	}

}


