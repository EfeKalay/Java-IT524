import java.util.Scanner;

public class FriendNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter first number");
		int number1 = sc.nextInt();
		
		System.out.println("Please enter second number");
		int number2 = sc.nextInt();
		
		if(areFriends(number1,number2)) {
			System.out.println("Given numbers are friends");
		} else {
			System.out.println("Given numbers are NOT friends");
		}
		

	}
	
	static boolean areFriends(int num1, int num2) {
		boolean result = false;
		
		if(dividersSum(num1)==num2 && dividersSum(num2)==num1) result = true;
		
		
		return result;
	}
	
	static int dividersSum(int num) {
		
		int dividersSum = 1;
		
		for(int i=2; i<=num/2; i++ ) {
			
			if(num%i == 0) {
				dividersSum += i;	
			}
		}
		
		return dividersSum;
		
	}

}
