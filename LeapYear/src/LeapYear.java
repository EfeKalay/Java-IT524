import java.util.Scanner;

public class LeapYear {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Year: ?");
		int year = sc.nextInt();
		
		if (isLeap(year)) System.out.println(year + " is a yeap year.");
		else System.out.println(year + " is NOT a yeap year.");
		
	}
	
	static boolean isLeap(int year) {
		boolean leap = false;
		
		if(year % 4 == 0) {
			if (year % 100 != 0) leap = true;
			else {
				if (year % 400 == 0) leap = true;
			}
		}
		
		return leap;
		
	}

}
