public class Calculator {

	private int value;

	public Calculator() {
		this.value = 0;
	}

	public void add(int number) {
		this.value += number;
	}

	public void subtract(int number) {
		// this is a deliberate error
		this.value += number;
	}

	public int getValue() {
		return this.value;
	}
}
