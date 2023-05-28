package com.may.fifteen.designpattern;

public class BlueColour extends Colour{
	private String colourName;

	public void blueColour()
    {
        this.setColourName("blue");
    }
  
    void addColour()
    {
        System.out.println("Blue colour added");
    }

	public String getColourName() {
		return colourName;
	}

	public void setColourName(String colourName) {
		this.colourName = colourName;
	}
}
