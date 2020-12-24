import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to the Arithmetic Quiz");
		System.out.println("How many questions?");
		int numQuestions = sc.nextInt();
		CalculationGame game = new CalculationGame(numQuestions);
		game.start();
	}

}
