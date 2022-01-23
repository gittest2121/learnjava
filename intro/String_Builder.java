/**
 * Usually, you need to build up strings from shorter strings
 * ,such as, keystrokes or words from a file
 * It would be inefficient to use string concatenation for this
 * purpose, since eveytime you concatenate strings, a new String
 * object is constructed
 *
 * This is time consuming and wastes memory
 * Using the StringBuilder class avoids this issue.
 */
class String_Builder {
	public static void main(String[] args) {
		// Construct an empty string builder
		StringBuilder builder = new StringBuilder();

		// Each time you need to add another part, call the
		// append method
		char ch = 'T';
		String str = "Works";
	       	String cat = " Meow!";	// Initializing Strings

		builder.append(ch);  // appends a single character (ch is not character!)
		builder.append(str); // append a string
	       	builder.append(cat); // append a string

		// When you are done building the string, call the toString
		// method. You will get a String object with the character
		// sequence contained in the builder

		String completedString = builder.toString();

		System.out.println(completedString);
		System.out.println("Number of code units of the builder or buffer: " + builder.length());
		System.out.println(builder.insert(2, "Zero "));
		System.out.println(builder.delete(0, 1));
	}
}

/**
 * Note:
 * The string builder class was introduced in Java 5
 * Its predecessor, StringBuffer, is slightly less efficient
 * , but it allows multiple threads to add or remove characters
 *
 * If all string editing happens in a single thread (which is usually
 * the case), you should use StringBuilder instead.
 *
 * The APIs of both classes are identical.
 */

/* What is API?
 * API stands for Application Programming Interface
 * An API is a particular set of code (rules) and specifications that software
 * programs can followto communicate with each other
 * It serves as an interface between different software programs
 * and facilitates their interaction, similar to the way the user interface
 * facilitates interaction between humans and computers
 * 
 * Simply, a way for an application to interact with certain system/application/library, etx.
 * 
 * Credits: https://stackoverflow.com/a/7440712
 * License: CC-BY-SA 3.0
 */
