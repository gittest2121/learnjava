public class Example {

	public static void main(String[] args) {

		Person2 first = new Person2("First");
		// A variable of type Person is declared
		// The value returned by the Person class constructor is copied.
		//
		// The constructor creates an object whose birth year is set to 1970 and whose name is set to the value received as a parameter.
		// The constructor returns a reference.
		//
		// A Person object has been created in the memory and the first variable defined in the main method contains a reference to it.

		System.out.println(first);
		// print the value of the variable "first" using the method call System.out.println (sout)
		//
		// The method call "sout" searches for the "toString" method on the object referenced by the "first" variable.

		youthen(first);
		// calls youthen method, to which we pass the variable "first" as an argument.
		// When the method "youthen" is called, the value of the parameter variable is copied to be used by the youthen method.
		// Since "first" is a reference variable, the reference that was created earlier is copied for method use.

		System.out.println(first);
		// call the sout method again for variable "first"
		
		Person2 second = first;
		// create a variable "second" of reference type Person2, which copies the value of variable "first" (reference to the already existing Person object created earlier, which is copied by variable first)

		youthen(second);
		// this time, it affects both second and first -- since second contains the same reference to the object that first copied.

		System.out.println(first);
		// incremented

	}

	public static void youthen(Person2 person) {
		person.setBirthYear(person.getBirthYear() + 1);
	}
}
