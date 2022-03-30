public class Main {
	public static void main(String[] args) {
		Student ollie = new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028");
		System.out.println(ollie);
		ollie.secretMethod();
		System.out.println(ollie.credits());

		Person olliePerson = new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028");
		System.out.println(olliePerson);
		olliePerson.secretMethod();
		// System.out.println(olliePerson.credits()); -- this does not work

		Object ollieObject = new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028");
		System.out.println(ollieObject);

		Object alice = new Student("Alice", "None");
		// alice.secretMethod(); -- doesn;t work
		// alice.study(); -- doesn't work either
		System.out.println(alice); // this works!

		// The actual type of an object dictates which method is executed
	}
}
