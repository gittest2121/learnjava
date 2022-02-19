class Text {

	private String text;

	public Text(String text) {
		this.text = text;
	}

	@Override
	public String toString() {
		return "The technique of having two (or more) " + text + "s, [which differ in number or type of parameters], in a class is known as " + text + " Overloading.";
	}

	public static void main(String[] args) {

		Text constructor = new Text("Constructor");
		Text method = new Text("Method");


		System.out.println("Constructor Overloading:");
		System.out.println(constructor);

		System.out.println();
		System.out.println();

		System.out.println("Method Overloading:");
		System.out.println(method);
	}
}
