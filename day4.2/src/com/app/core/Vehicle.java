package com.app.core;

import java.time.LocalDate;

public class Vehicle {
	/*
	 * chasisNo(string) : Unique ID, color(enum) , netPrice(double) ,
	 * manufactureDate(LocalDate),company,isAvailable
	 */
	private String chasisNo;
	private Color vehicleColor;
	private double netPrice;// netPrice=base price + color based cost
	private LocalDate manufactureDate;
	private String company;
	private boolean isAvailable;

	public Vehicle(String chasisNo, Color vehicleColor, double netPrice, LocalDate manufactureDate, String company) {
		super();
		this.chasisNo = chasisNo;
		this.vehicleColor = vehicleColor;
		this.netPrice = netPrice;
		this.manufactureDate = manufactureDate;
		this.company = company;
		this.isAvailable = true;
	}
	public Vehicle(String chasisNo)
	{
		this.chasisNo=chasisNo;
	}

	@Override
	public String toString() {
		return "Vehicle [chasisNo=" + chasisNo + ", vehicleColor=" + vehicleColor + ", netPrice=" + netPrice
				+ ", manufactureDate=" + manufactureDate + ", company=" + company + ", isAvailable=" + isAvailable
				+ "]";
	}

	//In Object- equals method- checks Referecnce Equality
	//In String -equals mehtod -checks 
	@Override
	
	//We are override class Objects equals method
	public boolean equals(Object o) {
		System.out.println("in vehicle equals");
		if (o instanceof Vehicle)
			//Here we calling Strings equals method(No recursion)
			return this.chasisNo.equals(((Vehicle) o).chasisNo);
		return false;
		//why we want overriding-to achive runtime polymorphism
		//
	}

}
