/**
 * To represent text in computers, you have to solve two things.
 * Firstly, you have to map symbols to numbers
 * then, you have to represent a sequence of those numbers with bytes.
 *
 * Code point - a number that identifies a symbol.
 * Two well-known standards for assigning symbols - ASCII and Unicode
 * ASCII - defines 128 symbols
 * Unicode - defines 109384 symbols (that's way more than 2^16)
 *
 * ASCII specifies that number sequences are represented one byte per
 * number,
 * while Unicode specifies several possibilites - UTF-8, UTF-16 and
 * UTF-32
 *
 * When you try to use an encoding which uses less bits per character
 * than are needed to represent all possible values (such as UTF-16,
 * which uses 16-bits); you need some workaround.
 *
 * Thus, Surrogates are 16-bit values that indicate symbols that do not
 * fit into a single two-byte value.
 *
 * Java uses UTF-16 internally to represent text.
 *
 * In particular, a char is an unsigned two-byte value that contains a
 * UTF-16 value.
 *
 * Credits: https://stackoverflow.com/a/23980020
 * License: CC-BY-SA 4.0
 */

/**
 * Code points are the number given to the Unicode element.
 * While Code units in UTF-16 are units of 16-bit data.
 *
 * UTF-16 uses 1 or 2 code units to describe a code point.
 * Code units are 16-bit long, and
 * Code points could be 1 or 2 code units */

class CodePoints {
	public static void main(String[] args) {
		String greet = "Hello";
		for (int i = 0; i < greet.length(); ++i) {
			int index = greet.offsetByCodePoints(0, i);
			int cp = greet.codePointAt(i);
			System.out.println("i= " + i);
			System.out.println(index);
			System.out.println(cp + "\n");
		}
	}
}

/**
 * Finally don't think that you can ignore exotic characters with
 * code units above U+FFFF.
 * Your emoji loving users may put characters such as U+1F37A (a beer mug)
 * into strings.
 */

/* Conversely, to turn an array of code points to a string, use a constructor.
 * String str = new String(codePoints, 0, codePoints.length());
 */

/**
 * The JVM doesn't have to implement strings as sequences of
 * code units
 * In Java 9, strings that hold only single-byte code units use
 * a byte array, and all others a char array.
 */
