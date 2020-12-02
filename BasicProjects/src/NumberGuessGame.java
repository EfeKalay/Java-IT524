import java.util.Random;
import java.util.Scanner;

public class NumberGuessGame {

	public static void main(String[] args) {
		
		Random rnd = new Random();
		int randomNum = rnd.nextInt(100);
		
		Scanner sc = new Scanner(System.in);
		int guess = 0;
		int i = 1;
		do {
			System.out.println("Please, enter a number in the range of 0 and 100. " + i + "/10");
			guess = sc.nextInt();
			i++;
			if(guess == randomNum) {
				System.out.println("Congrat, you found it in " + i + ". guess");
				break;
			}else if (guess > randomNum) System.out.println("Too High");
			else System.out.println("Too Low");
			
		}while(i<10);
		
	}

}
