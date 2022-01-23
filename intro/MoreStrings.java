class MoreStrings {
	public static void main(String[] args) {
		String cat = new String("Meow"); // Constructor
	       	String dog = new String("Bow");	 // Constructor

		String dogsound = "Bow";	// Initialize
	       	String catsound = "meow";	// Initialize

		System.out.println(cat.equalsIgnoreCase(catsound));
		System.out.println(dog.startsWith("B"));
		System.out.println(catsound.endsWith("w"));
		String dogs = "bow";
		System.out.println(dogs.equals(dogsound.toLowerCase()));
		System.out.println(dog.startsWith("b"));
	}
}
