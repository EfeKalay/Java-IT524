
public class WomenCalculator extends BaseBMICalculator {
	

	@Override
	public void result(Person person) {
		String message;
		if(person.getBmi()< 18.5) message = "You are underweight.";
		else if (person.getBmi()< 25.0) message = "Your weight is in the healthy range.";
		else if (person.getBmi()< 30) message =  "You are overweight.";
		else message =  "Obesity!";
		
		person.setMessage(message);
	}

}