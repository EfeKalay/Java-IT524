package main;

import model.Bus;
import model.Destination;
import model.Passenger;

public class Main {
	
	public static void main(String[] args) {
		Bus bus1 = new Bus(Destination.ADANA, 1);
		
		bus1.insertPassenger(new Passenger("Efe", Destination.ADANA));
		bus1.insertPassenger(new Passenger("Eda", Destination.ANKARA));
		bus1.insertPassenger(new Passenger("Ece", Destination.ADANA));
	}
	
}
