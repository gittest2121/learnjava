import java.time.LocalDate;

class ExampleDate {

	public static void main(String[] args) {

		LocalDate now = LocalDate.now();
		int year = now.getYear();
		int month = now.getMonthValue();
		int day = now.getDayOfMonth();

		System.out.println(now);
		System.out.println("today is " + day + "." + month + "." + year);
	}
}
