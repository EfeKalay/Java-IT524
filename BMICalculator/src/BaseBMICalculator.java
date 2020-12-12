
public abstract class BaseBMICalculator {

	public abstract void result(Person person);
	
	public final void calculateBMI(Person person) {
		double result = person.weight * 10000/ (person.height * person.height);
		
		person.setBmi(result);
	}
}
