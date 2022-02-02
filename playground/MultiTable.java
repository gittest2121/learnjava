public class MultiTable {
	public static void multiplicationTable(int max) {
		int number = 1;
		while (number <= max) {
			printMultiplicationTableRow(number, max);
			++number;
		}
	}

	public static void printMultiplicationTableRow(int number, int coeff) {
		int printable = number;
		while (printable <= number * coeff) {
			System.out.print(" " + printable);
			printable += number;
		}

		System.out.println();
	}

	public static void main(String[] args) {
		multiplicationTable(3);
		System.out.println("\n");
		multiplicationTable(2);
		// Table looks bad when max > 3
	}
}
