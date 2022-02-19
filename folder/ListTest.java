import java.util.ArrayList;

class ListTest {
	public static void main(String[] args) {
		// Construct a word list for storing Strings
		ArrayList<String> wordList = new ArrayList<>();

		// Add values to word list
		wordList.add("Meow");
		wordList.add("Bow");
		wordList.add("Moo");

		// retrieve values from word list
		System.out.println("Cow: " + wordList.get(2));
		System.out.println("Cat: " + wordList.get(0));
		System.out.println("Dog: " + wordList.get(1));
		String Test = wordList.get(0)+wordList.get(1);
		System.out.println(Test);
	}
}
