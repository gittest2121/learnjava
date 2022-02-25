public class Main {

	public static void main(String[] args) {

		SimpleDate date = new SimpleDate(1, 1, 780);
		Person3 cat = new Person3("Meow", date);
		// Here "date" is a object variable that contains
		// reference to object constructed by the constructor
		// of class SimpleDate whose parameters are 1, 1, 780
		Person3 pascal = new Person3("Bow", 19, 6, 1723);

		System.out.println(cat);
		System.out.println(pascal);
	}
}
