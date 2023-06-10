/*
Created by Sondra Hoffman 
Date: 12/01/2019
CSC372 - Programming II
Colorado State University - Global Campus

Purpose:The Vehicle class represents a basic vehicle with attributes such as make, model, and miles per gallon (mpg). 

*/

package application;

public class Vehicle {
	
	private String make;
	private String model;
	private double mpg;
	
	public Vehicle(String make, String model, double mpg) {
		this.make = make;
		this.model = model;
		this.mpg = mpg;
	}
	
	public String getMake() {
		return make;
	}
	
	public void setMake(String make) {
		this.make = make;
	}
	
	public String getModel() {
		return model;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public double getMpg() {
		return mpg;
	}
	
	public void setMpg(double mpg) {
		this.mpg = mpg;
	}

	@Override
	public String toString() {
		return "Vehicle [make=" + make + ", model=" + model + ", mpg=" + mpg + "]";
	}
}

