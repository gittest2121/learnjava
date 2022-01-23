/* Conceptually, Java strings are a sequence of Unicode characters */
class Strings {
	public static void main(String[] args) {
		String e = ""; // an empty string
		String greet = "Hello";
		String subgreet = greet.substring(0, 3); // Hel
	        System.out.println(subgreet);
		System.out.println(subgreet.length());
		// Like C & C++, Java counts code units & code points
		// in strings starting with 0.
		// substring method counts from position 0 inclusive to position 3 exclusive
		// length = 3-0 = 3
		//
		// Concatenation
		String message = subgreet + "l";
		String msg = greet + subgreet;
		// No spaces
		System.out.println(message);
		System.out.println(msg);

		// static join method
		// put multiple strings together seperated by a delimiter
		String all = String.join(" : ", "T", "H", "I", "S");
		System.out.println(all);
		// outputs T : H : I : S

		String fun = String.join("LA", "Hey", "Coffee", "Java");
		System.out.println(fun);
		
		// repeat method (Java 11)
		String repeated = "Java";
		String rep = "Intro".repeat(4);
		System.out.println("Hey" + repeated.repeat(7));
		System.out.println(rep);

		// Strings are immutable. Looking at you JAVA!
		// In C, Strings are mutable

		greet = greet.substring(0, 3) + "p!";
		System.out.println(greet);

		// But immutable strings have one great advantage:
		// The compiler can arrange that strings are shared
		// To understand how this works,
		// think of the various strings as sitting in a common pool
		// String variables point to locations in the pool
		// If you copy a string variable, both the original and the copy
		// share the same characters
		//
		// Efficiency of sharing outweighs the inefficiency of string
		// editing by extracting substrings and concatenating

		// C Programmers are generally bewildered when they see
		// Java strings for the first time because they think of
		// strings as arrays of characters. (Do they?)
		//
		// A Java String is roughly analogous to a char* pointer
		//
		// In C:
		// 	char greet[] = "Hello";
		// While In Java:
		// 	char* greet = "Hello";
		//
		// Unlike C, Java does automatic garbage collection.
		// If a block of memory is no longer needed, it will
		// eventually be recycled.
		// So, you can assign to same strings, no matter how many
		// times you want; you won't have a memory leak in Java.
		// 
		// In C, the original string was allocated on the heap.
		// Memory LEAKS!!! when you try again

		// Unlike C, C++ string objects also perform automatic allocation
		// and deallocation of memory.
		// The memory management is performed explicitly by constructors,
		// assignment operators & destructions. However, C++ strings are
		// mutable - modify induvidual characters in a string.


		// Testing Strings for Equality
		// use the equals method
		String s = "Hello";
		String p = "Pillo";
		String m = "Hello";
		String h = "Hey";
		System.out.println(s.equals(p));
		System.out.println(s.equals(m));
		System.out.println(s.equals(h));
		System.out.println("Hello".equals(s)); // Legal
		String hi = "hello";
		System.out.println(m.equalsIgnoreCase(hi));
		// Don't use == operator to test whether two strings are equal.
		// Java only determines whether or not the strings are stored in the same
		// location.
		// Yes, you thought it! If strings are in same location,
		// they must be equal. But it is entirely possible to
		// store multiple copies of identical strings in different places.
		String greeting = "Hello";
		if (greeting == "Hello")
			// probably true
			System.out.println("For real?");
		if (greeting.substring(0, 3) == "Hel")
			// probably false
			System.out.println("Told you!");

		// If the JVM always arranges for equal strings to be shared, then
		// you could use the operator == for testing equality. But only string
		// literals are shared, not strings that are the result of operations
		// like + or substring.
		// THEREFORE NEVER USE == TO COMPARE STRINGS UNLESS YOU WANT TO END
		// UP WITH A PROGRAM WITH THE WORST KIND OF BUG - AN INTERMITTENT ONE
		// THAT SEEMS TO OCCUR RANDOMLY
		//
		// It is perhaps unfortunate that Java goes out of its way to give strings
		// the same "look and feel" as numeric values but then makes strings behave
		// like pointers for equality testing. The language designers could have
		// redefined == for strings, just as they made a special arrangement for +.
		// Oh well, every language has its share of inconsistencies.
		//
		// C PROGRAMMERS NEVER USE == TO COMPARE STRINGS BUT USE strcmp instead.
		// The Java method compareTo is the exact analog of strcmp
		// like
		// if (greet.compareTo(m) == 0) ..
		// but it seems clearer to use equals instead.
		//
		//
		// When you replace greet with another string, the Java code does roughly
		// the following:
		// 	char* temp = malloc(6)
		// 	strncpy(temp, greet, 3);
		// 	strncpy(temp + 3, "p!", 3);
		// 	greet = temp;
		// 	// Sure, greet points to the string "Help!"
		// 	Java comments cannot be NESTED! Don't confuse!
		


		String str = "";
		// Empty string "" 
		// length = 0
		if (str.length() == 0)
			System.out.println("Empty");
		if (str.equals(""))
			System.out.println("String Empty");

				// An Empty string is a Java object which holds the string length
				// namely 0
				// and an empty contents.
				// However, a String variable can also hold a special value
				// called null
				// No! Empty is not null!
				// null indicates that no object is currently asspcoated with the
				// variable
		if (str == null)
			System.out.println("Null Test");

		// For testing a string is neither null nor empty
		if (str != null && str.length() != 0)
			System.out.println("Hey That's illegal");

		
	}
}
