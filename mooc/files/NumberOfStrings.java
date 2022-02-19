import java.util.Scanner;

class NumberOfStrings {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int linecount = 0;
		while (true) {
			String text = scanner.nextLine();

			if (text.equals("end")) {
				break;
			} else {
				++linecount;
			}
		}

		System.out.println(linecount);
	}
}
