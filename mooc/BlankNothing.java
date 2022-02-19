import java.util.Scanner;
import java.nio.file.Paths;

class BlankNothing {
	public static void main(String[] args) {

		// create a scanner
		try (Scanner scanner = new Scanner(Paths.get("henkilot.csv"))) {

			// read all lines
			while (scanner.hasNextLine()) {
				String line = scanner.nextLine();

				// if line is blank, do nothing
				if (line.isEmpty()) {
					continue;
				}
			}

		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}
