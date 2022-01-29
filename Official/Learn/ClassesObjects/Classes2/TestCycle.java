public class TestCycle {
	public static void main(String[] args) {
		Bicycle model1 = new Bicycle(2, 45, 2);
		Bicycle model2 = new Bicycle(2, 150, 5);

		System.out.println(model1.getID());
		System.out.println(model2.getID());

		System.out.println(Bicycle.getNumberOfBicycles());

	}
}
