package com.may.fifteen.composite;

public class CompositeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Component hd = new Leaf(4000, "HDD");
		Component mouse=new Leaf (1000, "Mouse");
		Component monitor = new Leaf (8000, "Monitor");
		Component ram= new Leaf(3000, "Ram");
		Component cpu= new Leaf(7500, "cpu");
		
		Composite ph = new Composite("Peripheral");
		Composite cabinet= new Composite("Cabinet");
		Composite mb= new Composite("MB");
		Composite computer= new Composite("computer");
		
		mb.addComponent(cpu);
		mb.addComponent(ram);
		
		
		ph.addComponent(mouse);
		ph.addComponent(monitor);
		cabinet.addComponent(hd);
		cabinet.addComponent(mb);
		
		computer.addComponent(ph);
		computer.addComponent(cabinet);
		
		computer.showPrice();
	}

}
