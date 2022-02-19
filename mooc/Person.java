class Person {
	private String name;
	private int age;

	public Person(String initialName) {
		this.age = 0;
		this.name = initialName;
	}

        public static void main(String[] args) {
                Person cat = new Person("Cat");

                cat.printPerson();
                cat.growOlder();
                cat.growOlder();
                cat.printPerson();

		if (cat.isOfLegalAge()) {
			System.out.print("of legal age: ");
			cat.printPerson();
		} else {
			System.out.print("underage: ");
			cat.printPerson();
		}
        }

	public void printPerson() {
		System.out.println(this.name + ", age " + this.age + " years");
	}

	public void growOlder() {
		this.age += 1;
	}

	public boolean isOfLegalAge() {
		return this.age >= 18;
	}
}
