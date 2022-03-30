import java.util.stream.Collectors;
import java.util.List;
import java.util.ArrayList;

public class Sum {
	public static void main(String[] args) {
		List<Integer> values = new ArrayList<>();
		values.add(3);
		values.add(2);
		values.add(17);
		values.add(6);
		values.add(8);

		// forEach method
		values.stream().forEach(value -> System.out.println(value));

		System.out.println();
		System.out.println();

		// count method
		System.out.println("Values: " + values.stream().count());

		// you can use collect method to collect stream values into another collection.
		ArrayList<Integer> positives = values.stream()
			.filter(value -> value > 0)
			.collect(Collectors.toCollection(ArrayList::new));

		positives.stream()
			.forEach(value -> System.out.println(value));

		

		System.out.println();
		System.out.println();


		// combine string from a list of strings using reduce method
		// reduce method is useful
		// when you want to combine stream elements
		// to some other form
		ArrayList<String> words = new ArrayList<>();
		words.add("First");
		words.add("Second");
		words.add("Third");
		words.add("Fourth");

		String combined = words.stream()
			.reduce("", (previous, word) -> previous + " " + word);

		System.out.println(combined);


		System.out.println();
		System.out.println();
		// reduce Method
		int sum = values.stream()
			.reduce(0, (previousSum, value) -> previousSum + value);

		System.out.println(sum);

	}
}
