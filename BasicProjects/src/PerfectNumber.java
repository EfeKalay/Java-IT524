import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter a number");
		int number = sc.nextInt();
		
		if(isPerfect(number)) System.out.println(number + " is a Perfect Number.");
		else System.out.println(number + " is NOT a Perfect Number.");

	}
	
	static boolean isPerfect(int num) {
		int dividersSum = 1;
		
		for(int i=2; i<=num/2; i++ ) {
			
			if(num%i == 0) {
				dividersSum += i;	
			}
		}
		if(num == dividersSum) return true;
		else return false;	
	}

}
