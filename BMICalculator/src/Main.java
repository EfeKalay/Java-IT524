import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		AppUI appUI = new AppUI();
		
		Person user = new Person();
		
		appUI.getInputs(user);
		
		BaseBMICalculator calculator;
		
		if(user.gender.equals("male"))  calculator = new MenCalculator();
		else calculator = new WomenCalculator();
		
		calculator.calculateBMI(user);
		calculator.result(user);
		
		
		appUI.showOutputs();
		
		
				
			
		

	}

}
