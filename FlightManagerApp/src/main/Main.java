package main;

import java.time.LocalDateTime;

import model.Flight;
import model.Pilot;
import model.Plane;

public class Main {

	public static void main(String[] args) {

		// Plane
		Plane plane = new Plane(666, "Bird", 150, 500, "LARGEJET");

		// pilots
		LocalDateTime birth1 = LocalDateTime.of(1980, 01, 01, 0, 0);
		LocalDateTime job1 = LocalDateTime.of(2010, 01, 01, 0, 0);
		Pilot pilot1 = new Pilot(9876, "Jack Black", birth1, job1);
		pilot1.setStatus("PRIMARY");

		LocalDateTime birth2 = LocalDateTime.of(1976, 01, 01, 0, 0);
		LocalDateTime job2 = LocalDateTime.of(2005, 01, 01, 0, 0);
		Pilot pilot2 = new Pilot(9876, "John Travolta", birth2, job2);
		pilot2.setStatus("SECONDARY");

		LocalDateTime departure = LocalDateTime.of(2020, 04, 01, 12, 00);
		LocalDateTime arrival = LocalDateTime.of(2020, 04, 01, 15, 00);

		Pilot[] pilots = new Pilot[] { pilot1, pilot2 };

		Flight flight = new Flight(12345, "Dublin", "Istanbul", departure, arrival, pilots, plane);

		System.out.println(flight.displayInfo());

		// Changing the primary pilot
		LocalDateTime birth3 = LocalDateTime.of(1960, 01, 01, 0, 0);
		LocalDateTime job3 = LocalDateTime.of(2010, 01, 01, 0, 0);
		Pilot newPrimaryPilot = new Pilot(101010, "Bruce Dickinson", birth3, job3);
		newPrimaryPilot.setStatus("PRIMARY");
		flight.reassignPilot(newPrimaryPilot);

		System.out.println(flight.displayInfo());
		
		// Canceling the flight
		flight.cancelFlight();

	}

}
