import java.util.Scanner;
import java.util.ArrayList;
import java.nio.file.Paths;

class CheckPhone {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("File: ");
		String file = scan.nextLine();

		System.out.print("Phone Name: ");
		String name = scan.nextLine();

		ArrayList<Phone> phones = readFile(file);

		int wins = 0;
		int losses = 0;
		int games = 0;
		for (Phone phone : phones) {
			if (phone.Wins(name)) {
				++wins;
			}

			if (phone.Games(name)) {
				++games;
			}
		}

		System.out.println("Games: " + games);
		System.out.println("Wins: " + wins);
		System.out.println("Losses: " + (games-wins));
	}

	static ArrayList<Phone> readFile(String file) {
		ArrayList<Phone> phones = new ArrayList<>();

		try (Scanner fileReader = new Scanner(Paths.get(file))) {
			while (fileReader.hasNextLine()) {
				String line = fileReader.nextLine();
				String[] parts = line.split(",");

				phones.add(new Phone(parts[0], parts[1], Integer.valueOf(parts[2]), Integer.valueOf(parts[3])));
			}
		} catch (Exception e) {
			System.out.println("Unable to read the specified file: " + e.getMessage());
		}

		return phones;
	}
}
