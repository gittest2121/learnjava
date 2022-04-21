import java.util.Arrays;
import java.util.Scanner;

public class Repl {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] arr = {"Implement", "a", "java", "code"};
		for (int i = 0; i < arr.length; ++i) {
			System.out.print("Word " + (i+1) + ": ");
			String replWord = scanner.nextLine();
			arr[i] = replWord;
		}

		System.out.println(Arrays.toString(arr));
	}
}
