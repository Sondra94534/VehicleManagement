/*
Created by Sondra Hoffman
Date: 12/01/2019
CSC372 - Programming II
Colorado State University - Global Campus

The VehicleTest class is a test script that allows the user to input vehicle data, creates Vehicle objects, sorts them based on mpg, and then outputs the sorted list to both the console and a text file. */

package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Scanner;

public class VehicleTest {

    private static final int MAX_VEHICLES = 2;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<Vehicle> vehicles = new LinkedList<>();

        for (int i = 0; i < MAX_VEHICLES; i++) {
            System.out.println("Enter vehicle make:");
            String make = scanner.next();
            System.out.println("Enter vehicle model:");
            String model = scanner.next();
            double mpg = 0;
            System.out.println("Enter vehicle mpg:");
            try {
                mpg = scanner.nextDouble();
                vehicles.add(new Vehicle(make, model, mpg));
            } catch (InputMismatchException ex) {
                System.err.print("User did not enter a numerical value.\nPlease enter miles per gallon as a number: ");
                scanner.nextLine();
            }
        }

        scanner.close();

        Collections.sort(vehicles, new SortVehicles());

        System.out.println("Vehicles sorted by miles per gallon:");
        System.out.println(vehicles);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"))) {
            writer.write("Make,Model,MPG\n");
            for (Vehicle vehicle : vehicles) {
                String line = String.format("%s,%s,%.2f", vehicle.getMake(), vehicle.getModel(), vehicle.getMpg());
                writer.write(line);
                writer.write("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

