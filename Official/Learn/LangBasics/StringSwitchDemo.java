import java.util.Scanner;

public class StringSwitchDemo {
	static long startTime = System.nanoTime();
	public static int getMonthNumber(String month) {
		int monthNumber = 0;

		if (month == null) {
			return monthNumber;
		}

		switch (month.toLowerCase()) { // to avoid switch errors
			case "january": 
				monthNumber = 1;
				break;
			case "february": 
				monthNumber = 2;
				break;
			case "march": 
				monthNumber = 3;
				break;
			case "april": 
				monthNumber = 4;
				break;
			case "may": 
				monthNumber = 5;
				break;
			case "june":
				monthNumber = 6;
				break;
			case "july":
				monthNumber = 7;
				break;
			case "august":
				monthNumber = 8;
				break;
			case "september":
				monthNumber = 9;
				break;
			case "october":
				monthNumber = 10;
				break;
			case "november":
				monthNumber = 11;
				break;
			case "december":
				monthNumber = 12;
				break;
			default:
				monthNumber = 0;
				break;
		}
		return monthNumber;
	}

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter full name of the month: ");
		String month = in.next();

		int returnedMonthNumber = StringSwitchDemo.getMonthNumber(month);
		if (returnedMonthNumber == 0) {
			System.out.println("Invalid month");
		} else {
			System.out.println("Month Number: " + returnedMonthNumber);
		}

		System.out.println("Time taken for execution of program: " + (endTime - startTime) + " ns");
	}

	static long endTime = System.nanoTime();
}
