import java.util.Scanner;

class CompareTwoNos {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Enter two numbers: ");
		double a = in.nextDouble();
		double b = in.nextDouble();

		if (a > b)
			System.out.println("a is greater than b");
		else if (a == b)
			System.out.println("a equals b");
		else
			System.out.println("a is less than b");
	}
}

