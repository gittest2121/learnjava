public class PrintMain {
	public static void main(String[] args) {
		Printer printer = new Printer();
		String string = "works";
		printer.printCharacters(string);
		System.out.println();
		System.out.println();
		printer.printManyTimes("Working", 12);
	}
}
