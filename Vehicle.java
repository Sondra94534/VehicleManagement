package application;

import java.util.LinkedList;

public class Vehicle {
	
	private String make;
	private String model;
	private double mpg;//Field for miles per gallon.
	
	public Vehicle (String make, String model, double mpg) {
		super();
		this.make = make;
		this.model = model;
		this.mpg = mpg;
	}
	
	/**
	 * @return the make
	 */
	public String getMake() {
		return make;
	}
	/**
	 * @param make the make to set
	 */
	public void setMake(String make) {
		this.make = make;
	}
	/**
	 * @return the model
	 */
	public String getModel() {
		return model;
	}
	/**
	 * @param model the model to set
	 */
	public void setModel(String model) {
		this.model = model;
	}
	/**
	 * @return the miles per gallon
	 */
	public double getMpg() {
		return mpg;
	}
	/**
	 * @param mpg the miles per gallon to set
	 */
	public void setMpg(double mpg) {
		this.mpg = mpg;
	}

	@Override
	public String toString() {
		return "Vehicle [make=" + make + ", model=" + model + ", mpg=" + mpg + "]"+System.lineSeparator();
	}
	

}
