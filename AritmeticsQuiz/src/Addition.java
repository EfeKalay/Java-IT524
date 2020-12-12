import java.util.Scanner;

public class Addition extends BaseOps{

	@Override
	public double calculate(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1 + num2;
	}

	@Override
	public String askQuestion(int num1, int num2) {
		String	question = num1 +"+"+ num2;
		System.out.println(question);
		return question;
	}

}
