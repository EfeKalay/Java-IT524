package model;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Pilot {


	private long id;
	private String name;
	private LocalDateTime birthDate;
	private LocalDateTime jobStartDate;
	private String status;

	public Pilot(long id, String name, LocalDateTime birthDate, LocalDateTime jobStartDate) {
		this.id = id;
		this.name = name;
		this.birthDate = birthDate;
		this.jobStartDate = jobStartDate;
	}

	int getExperience() {

		long experience = jobStartDate.until(LocalDateTime.now(), ChronoUnit.YEARS);
		return (int) experience;
	}

	int getAge() {

		long age = birthDate.until(LocalDateTime.now(), ChronoUnit.YEARS);
		return (int) age;
	}

	String displayInfo() {
		String message = "Pilot id: " + id + "\nPilot name: " + name + "\nPilot experience: " + getExperience()
				+ " years" + "\nPilot age: " + getAge() + " years.";
		return message;
	}

	public long getId() {
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

	public LocalDateTime getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(LocalDateTime birthDate) {
		this.birthDate = birthDate;
	}

	public LocalDateTime getJobStartDate() {
		return jobStartDate;
	}

	public void setJobStartDate(LocalDateTime jobStartDate) {
		this.jobStartDate = jobStartDate;
	}
	
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
