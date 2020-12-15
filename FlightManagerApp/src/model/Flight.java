package model;
import java.time.LocalDateTime;

public class Flight {
	
	private long id;
	private String destination;
	private String departure;
	private LocalDateTime departureTime;
	private LocalDateTime arrivalTime;
	private Pilot[] pilots;
	private Plane plane;
	private boolean cancelled;
	
	
	public void reassignPilot(Pilot newPilot) {
		System.out.println("reassign pilot");
		if(pilots!=null) {
			for (int i = 0; i < pilots.length; i++) {
				if(pilots[i].getStatus()==newPilot.getStatus()) {
					pilots[i] = newPilot;
					break;
				}
			}	
		}	
	}
	
	public void cancelFlight() {

		if (cancelled == true) {

			System.out.println("Flight is already cancelled cannot be cancelled again.");
		} else {
			cancelled = true;
			System.out.println("Flight is cancelled");
		}

		
	}
	
	public Flight(long id, String destination, String departure, LocalDateTime departureTime, LocalDateTime arrivalTime,
			Pilot[] pilots, Plane plane) {
		super();
		this.id = id;
		this.destination = destination;
		this.departure = departure;
		this.departureTime = departureTime;
		this.arrivalTime = arrivalTime;
		this.pilots = pilots;
		this.plane = plane;
	}

	public String displayInfo() {
		String message = "Flight Info" +
						 "\nId is " + id + 
						 "\nDestination is " + destination + 
						 "\nDeparture Time is " + departureTime +
					     "\nArrival Time is " + arrivalTime +
					     "\nPlane:\n" + plane.displayInfo() +
					     "\nPilots:";

		for (Pilot pilot : pilots) {
			message+="\n"+ pilot.displayInfo();
		}
		
		return message;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getDeparture() {
		return departure;
	}
	public void setDeparture(String departure) {
		this.departure = departure;
	}
	public LocalDateTime getDepartureTime() {
		return departureTime;
	}
	public void setDepartureTime(LocalDateTime departureTime) {
		this.departureTime = departureTime;
	}
	public LocalDateTime getArrivalTime() {
		return arrivalTime;
	}
	public void setArrivalTime(LocalDateTime arrivalTime) {
		this.arrivalTime = arrivalTime;
	}
	public Pilot[] getPilots() {
		return pilots;
	}
	public void setPilots(Pilot[] pilots) {
		this.pilots = pilots;
	}
	public Plane getPlane() {
		return plane;
	}
	public void setPlane(Plane plane) {
		this.plane = plane;
	}
	public boolean isCancelled() {
		return cancelled;
	}
	public void setCancelled(boolean cancelled) {
		this.cancelled = cancelled;
	}

	

}
