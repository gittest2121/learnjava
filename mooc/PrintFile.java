import java.util.Scanner;
import java.nio.file.Paths;

class PrintFile {
	
	public static void main(String[] args) {

		try (Scanner scanner = new Scanner(Paths.get("data.txt"))) {

			// check whether file has next line
			while (scanner.hasNextLine()) {
				// read one file
				String row = scanner.nextLine();

				// print the read line
				System.out.println(row);
			}
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}
