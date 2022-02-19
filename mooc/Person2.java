class Person2 {
	private String name;
	private int age;
	private int weight;
	private int height;

	Person2(String name) {
		this.age = 0;
		this.weight = 0;
		this.height = 0;
		this.name = name;
	}

	String getName() {
		return this.name;
	}

	// Value-setting methods are often called "setters" v

	void setHeight(int height) {
		this.height = height;
	}

	void setWeight(int weight) {
		this.weight = weight;
	}

	//                                                  ^

	double BMI() {
		double heightPerHundred = this.height / 100.0;
		return this.weight / (heightPerHundred * heightPerHundred);
	}

	public static void main(String[] args) {
		Person2 matt = new Person2("Matt");
		Person2 jeff = new Person2("Jeff");

		matt.setHeight(104);
		matt.setWeight(70);

		jeff.setHeight(175);
		jeff.setWeight(63);

		System.out.println(matt.getName() + ", body mass index is " + matt.BMI());
		System.out.println(jeff.getName() + ", body mass index is " + jeff.BMI());
	}
}
