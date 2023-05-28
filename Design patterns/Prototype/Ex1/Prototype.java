package com.may.fifteen.designpattern;

public class Prototype {
	 public static void main (String[] args)
	    {
		 ColourStore.getColor("blue").addColour();
		 ColourStore.getColor("black").addColour();
		 ColourStore.getColor("black").addColour();
		 ColourStore.getColor("blue").addColour();
	    }
}
