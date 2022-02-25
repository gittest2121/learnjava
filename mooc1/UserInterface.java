import java.util.Scanner;

public class UserInterface {
	private Wordset wordset;
	private Scanner scanner;

	public UserInterface(Wordset wordset, Scanner scanner) {
		this.wordset = wordset;
		this.scanner = scanner;
	}

	public void start() {
		while (true) {
			System.out.println("Enter a word");
			String word = scanner.nextLine();

			if (this.wordset.contains(word)) {
				break;
			}

			wordset.add(word);
		}

		System.out.println("You gave the same word twice!");
		System.out.println(this.wordset.palindromes() + " of the words were palindromes");
	}
}
