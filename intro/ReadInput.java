import java.util.Scanner;

class ReadInput {
	public static void main(String[] args) {
		// Construct a scanner
		Scanner in = new Scanner(System.in);

		System.out.println("What is your name?");
		String name = in.nextLine();

		System.out.println("Type Meow!");
		String meow = in.nextLine();

		// nextLine method because input might contain                                                          // spaces (not in Meow!)  

		System.out.println("Your name is " + name);
		if (meow.equals("Meow!"))
			System.out.println("Cat says Meow!\n");
		else
			System.out.println("Dog says Bow!\n");

		System.out.println("How old are you?");
		int age = in.nextInt();

		// nextInt method reads the next Integer
		
		System.out.println("Ends at whitespaces. Type anything");
		String any = in.next(); // reads a single word (delimited by whitespace)

		System.out.println("Type any number");
		double dou = in.nextDouble(); // reads the next floating-point number

		System.out.println("\nage" + age + "any" + any + "dou" + dou);
	}
}
