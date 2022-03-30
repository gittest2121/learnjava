import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class LambdaExp {
	public static void main(String[] args) {
		// initializing a scanner and a list to which values are read
		Scanner scanner = new Scanner(System.in);
		List<String> inputs = new ArrayList<>();

		while (true) {
			String row = scanner.nextLine();
			if (row.equals("end")) {
				break;
			}

			inputs.add(row);
			
		}

		int numberOfMappedValues = 0;

		// determining the number of values divisible by three
		long numbersDivisibleByThree = inputs.stream()
			.mapToInt(s -> {
				// variables declared outside of an anonymous function cannot be used, so this won't work
				++numberOfMappedValues;
				return Integer.valueOf(s);
			}).filter(value -> value % 3 == 0)
			.count();
	}
}
