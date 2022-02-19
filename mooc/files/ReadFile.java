import java.util.ArrayList;
import java.util.Scanner;
import java.nio.file.Paths;

class ReadFile {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("File:");
		String file = scanner.nextLine();

		ArrayList<String> data = readFile(file);

		for (String word : data) {
			System.out.println(word);
		}
	}

	static ArrayList<String> readFile(String file) {

		ArrayList<String> words = new ArrayList<>();

		try (Scanner fileReader = new Scanner(Paths.get(file))) {
			
			while (fileReader.hasNextLine()) {
				String line = fileReader.nextLine();
				String[] word = line.split(" ");
				for (String text : word) {
					words.add(text);
				}
			}

		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage() + " not found.");
		}

		return words;
	}
}
