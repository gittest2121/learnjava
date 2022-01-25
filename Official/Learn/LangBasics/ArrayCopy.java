class ArrayCopy {
	public static void main(String[] args) {
		String[] copyFrom = {
			"Apple", "Banana", "Car", "Dog", "Egg", "Fish", "Game", "Horse", "Ice", "Jar", "Kite", "Lemon", "Mouse", "Nut", "Orange", "Pineapple", "Quartz", "Rope", "Shoe", "Tent", "Umberalla", "Vase", "Watch", "Xylophone", "Yacht", "Zip" };

		String[] copyTo = new String[7];
		System.arraycopy(copyFrom, 2, copyTo, 0, 7);
		for (String coffee : copyTo) {
			System.out.println(coffee + " ");
		}

		for (int i = 0; i < copyTo.length; ++i) {
			String coffee = copyTo[i];
			System.out.println(coffee + " ");
		}
	}
}

/* This is beautiful
 * Writing colon(:) is actually enhanced for loop.
 * For example,
 * for (String i: words) means the same things as
 * for (int i = 0; i < words.length; ++i) {}
 *
 * Credits: https://stackoverflow.com/a/14374760
 * for (Element e : elemnts) {
 * 	doSomething(e);
 * }
 */
