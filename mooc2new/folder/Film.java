public class Film {
	private String name;
	private int releaseYear;

	public Film(String name, int releaseYear) {
		this.name = name;
		this.releaseYear = releaseYear;
	}

	public String getName() {
		return this.name;
	}

	public int getReleaseYear() {
		return this.releaseYear;
	}

	@Override
	public String toString() {
		return this.name + " (" + this.releaseYear + ")";
	}
}
