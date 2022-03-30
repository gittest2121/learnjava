import java.util.ArrayList;

public class Person {
	private String firstName;
	private String lastName;
	private int birthYear;

	public Person(String firstName, String lastName, int birthYear) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthYear = birthYear;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public int getBirthYear() {
		return this.birthYear;
	}

	public static void main(String[] args) {
		ArrayList<Person> persons = new ArrayList<>();
		persons.add(new Person("Meow", "Cat", 1965));
		persons.add(new Person("Windows", "XP", 2001));
		persons.add(new Person("PC", "C", 1856));
		persons.add(new Person("Java", "Sun", 1995));
		persons.add(new Person("Python", "Python", 1991));

		long count = persons.stream()
			.filter(person -> person.getBirthYear() < 1970)
			.count();

		System.out.println("Number of persons who are born before 1970:" + count);


		long countP = persons.stream()
			.filter(person -> person.getFirstName().startsWith("P"))
			.count();

		System.out.println("Number of persons whose first name starts with P: " + countP);



		// sorting first names in alphabetical order
		persons.stream()
			.map(person -> person.getFirstName())
			.distinct() // returns a stream that only contains unique values
			.sorted() // sorts the strings
			.forEach(name -> System.out.println(name));
		
		// The distinct method described above uses the *equals* method that is in all objects for comparing whether two strings are the same.
		// The sorted method on the other hand is able to sort objects that contain some kind of order.
	}

}
