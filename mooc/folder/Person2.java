import java.util.Scanner;
import java.util.ArrayList;

class Person2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Person> persons = new ArrayList<>();

		// Read the names of persons from the user
		while (true) {
			System.out.println("Enter a name, empty will stop: ");
			String name = scanner.nextLine();
			if (name.isEmpty()) {
				break;
			}

			// Add new person to the list
			// whose name is previous given inputs
			persons.add(new Person(name));
		}

		// Print number of entered persons, and their induvidual
		// information
		System.out.println();
		System.out.println("Persons in total: " + persons.size());
		System.out.println("Persons: ");

		for (Person person : persons) {
			System.out.println(person);
		}
	}
}
