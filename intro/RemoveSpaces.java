class RemoveSpaces {
	public static void main(String[] args) {
		String str = "This is a string";
		System.out.println("After Removing Spaces: " + str.replaceAll("\\s", ""));
				// String.strip() is unicode-aware evolution of
				// trim()
				// Meaning trim() removes only characters <= U+0020 (space)
				// 
				// Also,
				// strip() is 5 times faster that trim() for blank string in 
				// Java 11.
				// Credits: https://stackoverflow.com/a/53640442
				// License: CC-BY-SA 4.0
				//
				// Credits: https://stackoverflow.com/a/51266583
				// License: CC-BY-SA 4.0
	}
}

/**
 * In case if you're wondering why trim() or strip() is not used
 * They remove only leading and trailing whitespaces, not inside of string
 * 
 * \s is a regular expressing that means "whitespace"
 * \\s when written inside string
 *
 * replaceAll is a better method in this context
 * Better name for file: Whitespaces.java
 *
 * Credits: https://stackoverflow.com/a/5455809
 * License: CC-BY-SA 3.0
 *
 * \\s+ can be used instead of \\s
 * For large strings, \\s+ is better
 * These are Regex Expressions
 * Regex stands for Regular Expression, also called regexp
 * Is a sequence of characters that specifies a search
 * pattern in text.
 */
