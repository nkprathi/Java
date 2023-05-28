package com.may.fifteen.designpattern;

import java.util.HashMap;
import java.util.Map;

public class ColourStore {
	private static Map<String, Colour> colourMap = new HashMap<String, Colour>();
    
    static
    {
    	colourMap.put("blue", new BlueColour());
    	colourMap.put("black", new BlackColour());
    }
      
    public static Colour getColor(String colourName)
    {
        return (Colour) colourMap.get(colourName).clone();
    }
}
