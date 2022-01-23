import java.util.Scanner;

class InputTest {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("Name: ");
		String name = in.nextLine();

		System.out.print("Grade: ");
		int grade = in.nextInt();

		System.out.println("Hello, " + name + ". Next year, you'll be in grade " + (grade+1) + ".");
	}
}
