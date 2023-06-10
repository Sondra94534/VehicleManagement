package application;

import java.util.Comparator;

public class SortVehicles implements Comparator<Vehicle>{

	public int compare(Vehicle v1, Vehicle v2) {
		if (v1.getMpg()>v2.getMpg())
			
			return 1; 
		
		else 
			
			return -1;
	}

}
