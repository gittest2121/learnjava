import java.util.List;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		List<Book> books = new ArrayList<>();
		books.add(new Book(new Person("Potty", 1198), "Potter", 1214));

		Person laura = new Person("Laura Braingan", 1978);

	        books.add(new Book(laura, "Self Control", 1984));
		books.add(new Book(laura, "Miami Vice", 1984));
		books.add(new Book(new Person("Puss Potty", 1298), "Potter Test", 1352));

		double average = books.stream()
			.mapToInt(book -> book.getAuthor().getBirthYear())
			.average()
			.getAsDouble();

		System.out.println("Average of the author's birth years: " + average);

		System.out.println();
		System.out.println("Books which names contain Potter:");
		books.stream()
			.filter(book -> book.getName().contains("Potter"))
			.map(book -> book.getAuthor())
			.forEach(author -> System.out.println(author));

		System.out.println();
		System.out.println();
		// streams can also be used to build more complex string representations
		books.stream()
			.map(book -> book.getAuthor().getName() + ": " + book.getName())
			.sorted()
			.forEach(name -> System.out.println(name));
	}
}
