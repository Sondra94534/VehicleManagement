package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Scanner;

public class Vehicle_Test {

	public static void main(String[] args) {
		/* Vehicle vehicle = new Vehicle(null, null, 0); */
		Scanner scnr = new Scanner(System.in);
		LinkedList<Vehicle> myVehicle = new LinkedList<Vehicle>();
		
		
		for (int i = 0; i < 2; i++) {//Loop to allow input of up to two vehicles. 
			System.out.println("Enter vehicle make");
			String make = scnr.next();
			System.out.println("Enter vehicle model");
			String model = scnr.next();
			double mpg = 0;
			System.out.println("Enter vehicle mpg");
			try {//Validates the user data and catches the exception if there is not a number input. 
				mpg = scnr.nextDouble();	
				myVehicle.add(new Vehicle(make,model,mpg));
			}catch (InputMismatchException ex) {
				
				System.err.print("User did not enter a numerical value\nPlease enter miles per gallon as a number: ");
				scnr.nextLine();
			}
			
		}
		scnr.close();
		
		Collections.sort(myVehicle, new SortVehicles());//Sorts the LinkedList data by mileage. 
		
		System.out.println("Vehicles sorted by miles per gallon: ");
		System.out.println(myVehicle);//Prints the sorted list to the console. 
		try {//Creates a text file for the program. 			
			
			BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
			for (int i = 0; i < myVehicle.size(); i++) {
				String line = String.format("%s,%s,%s", myVehicle.get(i).getMake(), 
						myVehicle.get(i).getModel(), myVehicle.get(i).getMpg());
				writer.write(line);
				writer.write("\n");
			}
			writer.close();
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}


}
