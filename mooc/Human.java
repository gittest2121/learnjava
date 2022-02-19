/* ToStringSecret */

class Human {
	
	private String name;
	private int age;

	Human(String name) {
		this.name = name;
		this.age = 0;
	}

	void growOlder() {
		++age;
	}

	public String toString() {
		return this.name + ", age " + this.age + " years";
	} // convert to weaker access privilege (public) since it is unable to override the default toString

	public static void main(String[] args) {
		Human tux = new Human("Tux");
		Human litux = new Human("Litux");

		int i = 0;
		while (i < 30) {
			tux.growOlder();
			++i;
		}

		litux.growOlder();

		System.out.println(tux); // same as System.out.println(tux.toString())
		System.out.println(litux); // same as System.out.println(litux.toString())
	}
}

// So, what happened at System.out.println method?
// In principle, the *System.out.println* method requests the object's string representation and prints it.
// The call to the *toString* method returning the string representation does not have to be written explicitly, as Java adds it automatically.
//
// When a programmer writes:
// System.out.println(tux);
//
// Java extends the call at run time to the following form:
// System.out.println(tux.toString());
//
// Also The secret of printing integers and doubles.
