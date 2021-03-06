public class List<Type> {
	private Type[] values;
	private int firstFreeIndex;

	public List() {
		this.values = (Type[]) new Object[10];
		this.firstFreeIndex = 0;
	}

	public void add(Type value) {
		if (this.firstFreeIndex == this.values.length) {
			grow();
		}

		this.values[this.firstFreeIndex] = value;
		++this.firstFreeIndex;
	}

	private void grow() {
		// create a new array whose size is 1.5 times the size
		// of old array
		int newSize = this.values.length + this.values.length / 2;
		Type[] newValues = (Type[]) new Object[newSize];
		for (int i = 0; i < this.values.length; ++i) {
			newValues[i] = this.values[i];
		}

		// Automatic Java garbage collector, you can do your job now!

		this.values = newValues;
	}

	public boolean contains(Type value) {
		// Assumed that user will not add a null reference to the list
		// and equals method checks that the value given toit as a
		// parameter is not null
		return indexOfValue(value) >= 0;
	}

	public void remove(Type value) {
		int indexOfValue = indexOfValue(value);
		if (indexOfValue < 0) { // -1
			return; // not found
		}

		moveToTheLeft(indexOfValue);
		--this.firstFreeIndex;
	}

	private int indexOfValue(Type value) {
		for (int i = 0; i < this.firstFreeIndex; ++i) {
			if (this.values[i].equals(value)) {
				return i;
			}
		}

		return -1;
	}

	public void moveToTheLeft(int fromIndex) {
		for (int i = fromIndex; i < this.firstFreeIndex - 1; ++i) {
			this.values[i] = this.values[i + 1];
		}
	}

	// return the value in the given index of the List
	public Type value(int index) {
		if (index < 0 || index >= this.firstFreeIndex) {
			throw new ArrayIndexOutOfBoundsException("Index " + index + " outside of [0, " + this.firstFreeIndex + "]");
		}

		return this.values[index];
	}

	public int size() {
		return this.firstFreeIndex;
	}
}
