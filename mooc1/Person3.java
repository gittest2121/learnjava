public class Person3 {
	private String name;
	private SimpleDate birthday;
	private int weight = 0;
	private int length = 0;

	public Person3(String name, SimpleDate date) {
		this.name = name;
		this.birthday = date;
	}

	public Person3(String name, int day, int month, int year) {
		this.name = name;
		this.birthday = new SimpleDate(day, month, year);
	}
	// The constructor receives as parameters the different parts
	// of the date.
	// They are used to create a date object, and finally the
	// reference to that date is copied as the value of the object
	// variable birthday.
	
	public String toString() {
		return this.name + ", born on " + this.birthday;
	}
}
