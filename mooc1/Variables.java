class Variables {
	
	private String name;

	public Variables(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
		
		// primitive variable
		int value = 10;
		System.out.println(value);

		// reference variable
		Variables test = new Variables("Test");
		System.out.println(test);
	}
}
