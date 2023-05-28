package com.may.fifteen.designpattern;

abstract class Colour implements Cloneable{
	protected String colorName;
    
     abstract void addColour();
      
    public Object clone()
    {
        Object clone = null;
        try
        {
            clone = super.clone();
        }
        catch (CloneNotSupportedException e)
        {
            e.printStackTrace();
        }
        return clone;
    }
}
