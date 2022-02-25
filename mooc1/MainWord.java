import java.util.Scanner;

public class MainWord {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Wordset set = new Wordset();

		UserInterface userinterface = new UserInterface(set, scanner);
		userinterface.start();
	}
}
