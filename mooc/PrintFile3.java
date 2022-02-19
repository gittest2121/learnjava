import java.util.Scanner;
import java.nio.file.Paths;

class PrintFile3 {
	
	public static void main(String[] args) {

		// Yes! The file does not exist. This is on purpose.
		try {
			Scanner scanner = new Scanner(Paths.get("data2.txt"));

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
