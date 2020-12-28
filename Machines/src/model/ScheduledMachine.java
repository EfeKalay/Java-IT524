package model;

public class ScheduledMachine extends Machine {

	private String[] jobList;
	
	

	public ScheduledMachine(Priority priority, String specialization, String[] jobList) {
		super(priority, specialization);
		this.jobList = jobList;
	}



	public String[] getJobList() {
		return jobList;
	}

	@Override
	public void printInformation() {
		System.out.println( "Type:Scheduled Machine\n"
				+ "ID:"+ getMachineId() 
				+ ", priority:"+ getPriority()
				+ ", specialization:"+ getSpecialization()
				+ "\nJobs:");
		int i = 0;
		for (String job : jobList) {
			i++;
			System.out.println(i + "- " + job);
		}
		
	}
	
}
