public class Person2 {
	private String name;
	private int birthYear;

	public Person2(String name) {
		this.name = name;
		this.birthYear = 1970;
	}

	public int getBirthYear() {
		return this.birthYear;
	}

	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}

	public String toString() {
		return this.name + " (" + this.birthYear + ")";
	}
}
