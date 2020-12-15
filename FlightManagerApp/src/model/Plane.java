package model;

public class Plane {
	
	private long id;
	private String name;
	private int capacity;
	private int range;
	private String type;
	
	public Plane(long id, String name, int capacity, int range, String type) {
		this.id = id;
		this.name = name;
		this.capacity = capacity;
		this.range = range;
		this.type = type;
	}

	String displayInfo() {
		String message = "Plane id: " + id +
						 "\nPlane name: "+ name +
						 "\nPlane capacity: " + capacity + " passengers"+
						 "\nPlane range: " + range + " kms" +
						 "\nPlane type: "+ type +".";
		return message;
	}
	
	
	public Long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public int getRange() {
		return range;
	}

	public void setRange(int range) {
		this.range = range;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
