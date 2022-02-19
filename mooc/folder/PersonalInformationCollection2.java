import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection2 {

    public static void main(String[] args) {
        // implement here your program that uses the PersonalInformation class

        ArrayList<Person> persons = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the person details seperated by a comma. e.g.: Java,2");

	while (true) {
            System.out.print("First name: ");
            String details = scanner.nextLine();
            if (details.isEmpty()) {
                break;
            }
            
            String[] parts = details.split(",");
	    String name = parts[0];
	    int age = Integer.valueOf(parts[1]);
	    persons.add(new Person(name, age));

	    System.out.println();
	    System.out.println("Total number of persons: " + persons.size());
	    System.out.println("Persons: ");

	    for (Person person : persons) {
		    System.out.println(person);
	    }
	}
    }
}
