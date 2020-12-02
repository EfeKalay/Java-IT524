import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter a number");
		int number = sc.nextInt();
		
		if(isPrime(number)) System.out.println(number + " is a Prime Number.");
		else System.out.println(number + " is NOT a Prime Number.");

	}
	
	static boolean isPrime(int num) {
		boolean result = true;
		
		if (num < 2) result = false;
		
		for(int i=2; i<num/2; i++ ) {
			
			if(num%i == 0) {
				result = false;
				break;
			}
		}
		
		return result;	
	}

}
