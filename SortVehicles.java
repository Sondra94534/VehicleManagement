/*
Created by Sondra Hoffman
Date: 12/01/2019
CSC372 - Programming II 
Colorado State University - Global Campus

Purpose: 
The code uses a custom implementation of the Comparator interface in Java. 
It defines a compare method that takes two Vehicle objects as arguments and compares them based on their miles per gallon (mpg) values.
*/

import java.util.Comparator;

public class SortVehicles implements Comparator<Vehicle> {

    @Override
    public int compare(Vehicle v1, Vehicle v2) {
        if (v1.getMpg() > v2.getMpg())
            return 1;
        else if (v1.getMpg() < v2.getMpg())
            return -1;
        else
            return 0;
    }
}

