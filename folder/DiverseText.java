import java.util.Scanner;

class DiverseText {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int sum = 0;

		while (true) {
			String input = reader.nextLine();
			if (input.equals("")) {
				break;
			}

			String[] parts = input.split(",");
			sum += Integer.valueOf(parts[1]);
		}

		System.out.println("Sum of the ages is " + sum);
	}
}
