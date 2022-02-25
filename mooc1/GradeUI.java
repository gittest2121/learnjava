import java.util.Scanner;

public class GradeUI {

	private GradeRegister register;
	private Scanner scanner;

	public GradeUI(GradeRegister register, Scanner scanner) {
		this.register = register;
		this.scanner = scanner;
	}

	public void start() {
		this.readPoints();
		System.out.println();
		printGradeDistribution();
	}

	public void readPoints() {
		while (true) {
			System.out.print("Points: ");
			String input = scanner.nextLine();

			if (input.isEmpty()) {
				break;
			}

			int points = Integer.valueOf(input);

			if (points < 0 || points > 100) {
				System.out.println("Impossible number.");
				continue;
			}

			this.register.addGradeBasedOnPoints(points);
		}
	}

	public static void printStars(int stars) {
		while (stars > 0) {
			System.out.print("*");
			--stars;
		}
	}

	public void printGradeDistribution() {
		int grade = 5;
		while (grade >= 0) {
			int stars = register.numberOfGrades(grade);
			System.out.print(grade + ": ");
			printStars(stars);
			System.out.println();

			--grade;
		}
	}
}
