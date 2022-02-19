import java.util.ArrayList;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class Person {

	private String name;
	private int age;
	private int weight;
	private int height;
	private LocalDateTime createdAt;

	Person(String name) {
		this.name = name;
		this.age = 0;
		this.weight = 0;
		this.height = 0;
		this.createdAt = LocalDateTime.now();
	}

        Person(String name, int age) {
                this.name = name;
                this.age = age;
                this.weight = 0;
                this.height = 0;
                this.createdAt = LocalDateTime.now();
        }

	String getName() {
		return this.name;
	}

	int getAge() {
		return this.age;
	}

	void growOlder() {
		++this.age;
	}

	void setHeight(int newHeight) {
		this.height = newHeight;
	}

	void setWeight(int newWeight) {
		this.weight = newWeight;
	}

	double BMI() {
		double heightByHundred = this.height / 100.0;
		return this.weight / (heightByHundred * heightByHundred);
	}

	// let's play with date and time
	String getCreatedDate() {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");
		return formatter.format(this.createdAt);
	}

	// weaker access public for strong overriding
	@Override
	public String toString() {
		return this.name + ", age " + this.age + " years";
	}

	public static void main(String[] args) {
		ArrayList<Person> persons = new ArrayList<>();

		// create a person object
		Person john = new Person("John");

		// add to the list
		persons.add(john);


		// person objects can also be created "in the same sentence" that they are added to the list
		persons.add(new Person("Matthew"));
		persons.add(new Person("Martin"));

		for (Person person : persons) {
			System.out.println(person);
			System.out.println("Created on: " + john.getCreatedDate());
		}
	}
}
