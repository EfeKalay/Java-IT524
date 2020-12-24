package model;

import java.util.ArrayList;

public class Bus {

	private Destination destination;
	private ArrayList<Passenger> passengers;
	private int capacity;
	
	
	public Bus(Destination destination, int capacity) {
		super();
		passengers = new ArrayList<Passenger>();
		this.destination = destination;
		this.capacity = capacity;
	}
	
	public Destination getDestination() {
		return destination;
	}
	public void setDestination(Destination destination) {
		this.destination = destination;
	}
	
	public ArrayList<Passenger> getPassenger() {
		return passengers;
	}
	public void setPassenger(ArrayList<Passenger> passengers) {
		this.passengers = passengers;
	}
	
	
	
	public void insertPassenger(Passenger passenger) {
		if (passengers.size() < capacity && passenger.getDestination() == destination) {
			passengers.add(passenger);
			System.out.println("Passenger inserted!");
		}else if (passenger.getDestination() != destination) {
			System.out.println("Mismatched destination! Passenger cannot be inserted!");
		}else {
			System.out.println("Bus is FULL! Passenger cannot be inserted!");
		}
		
	}
	
}
