public class Welcome {
	public static void main(String[] args) {
		String greet = "Welcome to Java!";
		System.out.println(greet);
		for (int i = 0; i < greet.length(); i++)
			System.out.print("=");
		System.out.println();
	}
}
