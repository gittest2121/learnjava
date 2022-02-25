import java.util.Scanner;

public class GradeProgram {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		GradeRegister register = new GradeRegister();

		GradeUI UI = new GradeUI(register, scanner);
		UI.start();
	}
}
