import java.util.Scanner;

public class Sales {
	public static void main(String[] args) {
		String performance;
		int bonus;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter target: ");
		double target = in.nextDouble();
		System.out.print("Enter your Sales: ");
		double yourSales = in.nextDouble();

		if (yourSales >= 2*target) {
			performance = "Excellent";
			bonus = 1000;
			System.out.println(performance + ", Your bonus is "+ bonus +" dollars");
		}
		else if (yourSales >= 1.5*target) {
			performance = "Fine";
			bonus = 500;
                        System.out.println(performance + ", Your bonus is "+ bonus +" dollars");
		}
		else if (yourSales >= target) {
			performance = "Satisfactory";
			bonus = 100;
                        System.out.println(performance + ", Your bonus is "+ bonus +" dollars");
		}
		else
			System.out.println("You're fired");
	}
}
