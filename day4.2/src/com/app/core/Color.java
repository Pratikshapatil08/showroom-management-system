package com.app.core;
//Each enum  has parent class - java.lang.Enum
public enum Color {
	//Singelton 
	WHITE(10000), SILVER(20000), BLACK(15000), BLUE(35000), RED(50000);
	//state : Colorcost
	private double colorCost;
	//All enum constructor are private
	private Color(double colorCost) {
		//super(name,ordinal(pos))
		this.colorCost = colorCost;
	}
	//getter

	public double getColorCost() {
		return colorCost;
	}
	@Override
	public String toString()
	{
		return name()+"@"+colorCost;
	}
	
}
