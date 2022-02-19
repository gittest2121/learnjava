import java.util.ArrayList;
import java.util.Scanner;

class Filterlist {
	// Filtering printing from the list
	
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		ArrayList<Person> persons = new ArrayList<>();

		persons.add(new Person("Meow", 7));
		persons.add(new Person("Bow", 558));
		persons.add(new Person("Hotspot", 121));
		
		System.out.print("What is the age limit? ");
		int ageLimit = Integer.valueOf(scanner.nextLine());
		
		for (Person person : persons) {
			if (person.getAge() >= ageLimit) {
			System.out.println(person);
			}
		}
	}
}
