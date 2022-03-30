import java.util.ArrayList;

public class GeneralList<T> implements List<T> {
	private ArrayList<T> values;

	public GeneralList() {
		this.values = new ArrayList<>();
	}

	@Override
	public void add(T value) {
		this.values.add(value);
	}

	@Override
	public T get(int index) {
		return this.values.get(index);
	}

	@Override
	public T remove(int index) {
		T value = this.values.get(index);
		this.values.remove(index);
		return value;
	}
}
