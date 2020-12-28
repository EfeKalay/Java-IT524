package model;

import java.util.ArrayList;

public class Machine {

	private int id ;
	private Priority priority;
	private String specialization;
	
	private static ArrayList<Integer> IDLIST = new ArrayList<Integer>();
	
	
	
	public Machine( Priority priority, String specialization) {
		setUniqueId();
		this.priority = priority;
		this.specialization = specialization;
	}
	
	
	public int getMachineId() {
		return id;
	}
	private void setUniqueId() {
		if(IDLIST.isEmpty()) id = 1;
		else id = IDLIST.size()+1;
		IDLIST.add(id);
	}
	public Priority getPriority() {
		return priority;
	}
	
	public String getSpecialization() {
		return specialization;
	}
	
	public void printInformation() {
		
		System.out.println("Type:Controller Machine\n"
				+ "ID:"+ getMachineId() +", priority:"+ getPriority() 
				+", specialization:"+ getSpecialization());
		
	}
	
	
}
