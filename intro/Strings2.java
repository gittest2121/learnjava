class Strings2 {
	public static void main(String[] args) {
		String str = "abc";
		// String class represents character string
		// All string literals in java programs are
		// implemented as instances of this class.

		/**
		 * Strings are constant; their values cannot
		 * be changed after they are created.
		 * String buffers support mutuable strings. Because
		 * String objects are immutable they can be shared
		 *
		 * The above statement is equivalent to */
		// Constructor
		char data[] = {'a', 'b', 'c'};
		String str2 = new String(data); // cannot use str

		// Some more examples
		System.out.println("abc");
		System.out.println(str);
		System.out.println(str2);

		String cde = "cde";
		System.out.println();
		System.out.println("abc"+ cde);
		String c = "abc".substring(2,3); // c
		String d = "cde".substring(1,2); // d
		System.out.println(c + d);

		// Test Equality
		System.out.println(c.equals("c"));
		System.out.println(cde.equals(str));
		String k = new String("Meow");
		String m = new String();
		System.out.println(k.isEmpty());
		System.out.println();
		System.out.println(m.isEmpty());

		System.out.println("\n");
		// toLowercase/toUppercase
		String hat = "HaT";
		System.out.println("Original: " + hat);
		System.out.println("ToLowercase: " + hat.toLowerCase());
		System.out.println("ToUppercase: " + hat.toUpperCase());

		// To character array
		System.out.println("ToCharArray: " + hat.toCharArray());

		// Check if it starts with m
		System.out.println("Check if it starts with m: " + hat.startsWith("m"));
		// Check if it starts with h
		System.out.println("Check with h: " + hat.startsWith("h"));
	}
}
