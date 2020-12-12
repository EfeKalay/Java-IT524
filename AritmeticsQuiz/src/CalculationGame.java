import java.util.Random;
import java.util.Scanner;

public class CalculationGame {
	private int numQuestion;
	private int numCorrect;
	private int numIncorrect;
	CalculationGame(int _numQuestion){
		numQuestion = _numQuestion;
	}
	
	/*
	 * private void control(double answer, double result) {
	 * 
	 * if (result == answer) { System.out.println("Correct!\n----------------");
	 * numCorrect++; }else { System.out.println("Incorrect!\n----------------");
	 * numIncorrect++; } }
	 * 
	 * 
	 * 
	 * private void showSummary(String lastQuestion) {
	 * System.out.println("Summary:\n" + "-------------\n" + "Question:\n" +
	 * lastQuestion + "\nNumber of correct: " + numCorrect
	 * +"\nNumber of incorrect: " + numIncorrect +"\nLeft: "
	 * +(numQuestion-numCorrect-numIncorrect) + "\n-------------"); }
	 */
	
	public void start() {
		
		BaseOps[] operations = new BaseOps[] {new Multiplication(), new Division(), new Addition(), new Subtraction()};
		Random rnd = new Random();
		Scanner sc = new Scanner(System.in);
		
		String lastQuestion;
		int number1;
		int number2;
		int operation;
		
		for (int i = 1; i <= numQuestion; i++) {
			number1 = rnd.nextInt(256);
			number2 = rnd.nextInt(256);
			operation = rnd.nextInt(operations.length);
			
			System.out.println("Question " + i + "/"+ numQuestion);
			
			lastQuestion = operations[operation].askQuestion(number1, number2);
			double answer = operations[operation].getAnswer(sc);
			double result = operations[operation].calculate(number1, number2);
			
			operations[operation].control(answer,result);
			operations[operation].showSummary(lastQuestion, numCorrect, numIncorrect, numQuestion);
		}
		System.out.println("------------------\nBye!");
	}
}
