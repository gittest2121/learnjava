/* Object as object variables
 * Objects may contain references to objects.
 */

public class SimpleDate {
	private int day;
	private int month;
	private int year;

	public SimpleDate(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public int getDay() {
		return this.day;
	}

	public int getMonth() {
		return this.month;
	}

	public int getYear() {
		return this.year;
	}

	@Override
	public String toString() {
		return this.day + "." + this.month + "." + this.year;
	}

	public boolean equals(Object compared) {
		// if the variables are located in the same position,
		// they are equal
		if (this == compared) {
			return true;
		}

		// if the type of the compared object is not SimpleDate,
		// the objects are not equal
		if (!(compared instanceof SimpleDate)) {
			return false;
		}

		// convert the Object type compared object
		// into a SimpleDate type object called comparedSimpleDate
		SimpleDate comparedSimpleDate = (SimpleDate) compared;

		// if the values of the object variables are the same,
		// the objects are equal
		if (this.day == comparedSimpleDate.day &&
				this.month == comparedSimpleDate.month &&
				this.year == comparedSimpleDate.year) {
			return true;
				}

		// else
		return false;
	}
}
