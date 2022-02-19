import java.util.Scanner;
import java.util.ArrayList;
import java.nio.file.Paths;

class CheckBox {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("File: ");
		String file = scanner.nextLine();

		ArrayList<Box> boxes = readFile(file);

		System.out.println("Box Name:");
		String boxname = scanner.nextLine();

		int wins = 0;
		for (Box boxNo : boxes) {
			if (boxNo.Wins(boxname)) {
				++wins;
			}
		}

		System.out.println("Wins: " + wins);
	}

	static ArrayList<Box> readFile(String file) {

		ArrayList<Box> box = new ArrayList<>();
		try (Scanner fileReader = new Scanner(Paths.get(file))) {
			while (fileReader.hasNextLine()) {
				String line = fileReader.nextLine();
				String[] words = line.split(",");
				
				box.add(new Box(words[0], words[1], Integer.valueOf(words[2]), Integer.valueOf(words[3])));
			}
		} catch (Exception e) {
			System.out.println("Error: Failed to read file " + e.getMessage() + "!");
		}

		return box;
	}
}
