package model;

public class ControllerMachine extends Machine{

	private String department;
	private ScheduledMachine[] machineList;
	
	
	
	public ControllerMachine(Priority priority, String specialization, String department) {
		super(priority, specialization);
		this.department = department;
		this.machineList =  new ScheduledMachine[3];
	}
	
	
	public String getDepartment() {
		return department;
	}
	public ScheduledMachine[] getMachineList() {
		return machineList;
	}


	public void addMachine(ScheduledMachine scheduledMachine) {
		
		for (int i = 0;i < machineList.length;i++) {
			
			if (machineList[i] == null) {
				machineList[i] = scheduledMachine;
				System.out.println("Machine inserted");
				return;
			}
		}
		System.out.println("Controller machine capacity full");
	}

	@Override
	public void printInformation() {
		System.out.println("Type:Controller Machine\n"
				+ "ID:"+ getMachineId() +", priority:"+ getPriority()
				+", specialization:"+ getSpecialization() 
				+"\nDepartment:"+ getDepartment()
				+"\nScheduled Machines:");
		for (ScheduledMachine scheduledMachine : machineList) {
			scheduledMachine.printInformation();
		}
		
	}



	
	
	
}
