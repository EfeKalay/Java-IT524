import java.util.Scanner;

public abstract class BaseOps {
	
	public abstract double calculate(int num1, int num2);
	public abstract String askQuestion(int num1, int num2);
	
	public final double getAnswer(Scanner sc) {
		double answer = sc.nextDouble();
		System.out.println("-----------------");
		return answer;
	}
	
	public final boolean control(double answer, double result) {
		
		if (result == answer) {
			System.out.println("Correct!\n----------------");
			return true;
		}else {
			System.out.println("Incorrect!\n----------------");
			return false;
		}	
	}
	
	public final void showSummary(String lastQuestion, int numCorrect, int numIncorrect, int numQuestion) {
		System.out.println("Summary:\n"
				+ "-------------\n"
				+ "Question:\n"
				+ lastQuestion 
				+ "\nNumber of correct: " + numCorrect
				+"\nNumber of incorrect: " + numIncorrect
				+"\nLeft: " +(numQuestion-numCorrect-numIncorrect)
				+ "\n-------------");
	}
}

