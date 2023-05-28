package com.may.fifteen.designpattern;

public class BlackColour extends Colour{
	private String colourName;

	public void blackColour()
    {
        this.setColourName("black");
    }
  
    @Override
    void addColour()
    {
        System.out.println("Black colour added");
    }

	public String getColourName() {
		return colourName;
	}

	public void setColourName(String colourName) {
		this.colourName = colourName;
	}
}
