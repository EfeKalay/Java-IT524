import java.util.Scanner;

public class AppUI {
	private Person _person;
	public void getInputs(Person person) {
		_person = person;
		Scanner sc = new Scanner(System.in);
		String sex;
		boolean inputError = false;

		
		do {
			System.out.println("Please enter your sex(male or female).");
			sex = sc.next();
			sex = sex.toLowerCase();
			if (sex.equals("male") || sex.equals("female")) {
				person.gender = sex;
				inputError = false;
			}
			else inputError = true;
				
			
		} while (inputError);
		
		System.out.println("Please enter your height (in cm).");
		person.height = sc.nextInt();
		
		System.out.println("Please enter your weight (in kg).");
		person.weight = sc.nextInt();
	}
	
	public void showOutputs() {
		
		System.out.println( "Your genders is " + _person.gender + 
							". Your height is " + _person.height + 
							" cm and height is " + _person.weight +
							" kg. Your BMI is " + _person.getBmi() + " "+
							_person.getMessage());
		
	}

}
