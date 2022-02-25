import java.util.ArrayList;
import java.util.Scanner;

public class TestInput {

	public static void main(String[] args) {

		// Automate the passing of input by,
		// for example,
		// passing the string to be read into a Scanner object.

		String input = "one\n" + "two\n" +
			"three\n" + "four\n" +
			"five\n" + "one\n" +
			"six\n";

		Scanner reader = new Scanner(input);

		ArrayList<String> read = new ArrayList<>();

		while (true) {
			System.out.println("Enter an input: ");
			String line = reader.nextLine();
			if (read.contains(line)) {
				break;
			}

			read.add(line);

		}

		System.out.println("Thank you!");

		if (read.contains("six")) {
			System.out.println("A value that should not have been added to the group was added.");
		}
	}
}
