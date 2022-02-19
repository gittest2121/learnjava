import java.util.Scanner;

class Cubes {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (true) {
			String text = scanner.nextLine();

			if (text.equals("end")) {
				break;
			} else {
				int number = Integer.valueOf(text);
				System.out.println(number*number*number);
			}
		}
	}
}
