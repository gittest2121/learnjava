import java.util.Scanner;

class No {
	private static int readNumber(Scanner reader) {
		while (true) {
			System.out.println("Give a number: ");

			try {
				int readNumber = Integer.parseInt(reader.nextLine());
				return readNumber;
			} catch (Exception e) {
				System.out.println("User input was not a number.");
			}
		}
	}

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		System.out.println(readNumber(read));
	}
}
