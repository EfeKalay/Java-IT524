package main;

import model.*;

public class MainClass {
	public static void main(String[] args) {	
		
		ControllerMachine controllerMachine = 
				new ControllerMachine(Priority.HIGH,"CNC", "Pre Production");
		
		
		ScheduledMachine schMachine1 = new ScheduledMachine(Priority.MEDIUM, 
															"Metal Cutting", 
											new String[] {"Cut Part X","Blend Part Y",
														"Cut Part Z","Part Z Final"});	
		
		ScheduledMachine schMachine2 = new ScheduledMachine(Priority.MEDIUM, 
				"Plastic Folding", 
						new String[] {"Part ZHG","Fold Part YXS",
			"Blend Co3Yu","Part Z Fold"});
		
		ScheduledMachine schMachine3 = new ScheduledMachine(Priority.MEDIUM, 
				"Quality Control", 
						new String[] {"Control ZHG","Control Part YXS",
			"Control Co3Yu","Control Z Fold"});
		
		ScheduledMachine schMachine4 = new ScheduledMachine(Priority.MEDIUM, 
				"Idle", 
						new String[] {"Idle Task","Idle Task",
			"Idle Task","Idle Task"});
		
		
		
		controllerMachine.addMachine(schMachine1);
		controllerMachine.addMachine(schMachine2);
		controllerMachine.addMachine(schMachine3);
		controllerMachine.addMachine(schMachine4);
		System.out.println("---------------");
		
		controllerMachine.printInformation();
	}	
}
