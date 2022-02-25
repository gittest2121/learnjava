public class Bird {
	private String name;

	public Bird(String name) {
		this.name = name;
	}

	public boolean equals(Object compared) {

		if (this == compared) {
			return true;
		}

		if (!(compared instanceof Bird)) {
			return false;
		}

		Bird comparedBird = (Bird) compared;

		return this.name.equals(comparedBird.name);

	}
}
