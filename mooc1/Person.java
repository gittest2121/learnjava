public class Person {

	private String name;
	private int age;
	private double weight;
	private double height;

	public Person(String name, int age, double weight, double height) {
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.height = height;
	}

	public double BMI() {
		return this.weight / (this.height * this.height);
	}

	public double MaxHeartRate() {
		return 206.3 - (0.711 * this.age);
	}

	public String toString() {
		return this.name + ", BMI: " + this.BMI() + ", Maximum Heart Rate: " + this.MaxHeartRate();
	}
}
