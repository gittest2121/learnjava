import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MainFilm {
	public static void main(String[] args) {
		List<Film> films = new ArrayList<>();

		films.add(new Film("A", 2000));
		films.add(new Film("B", 1999));
		films.add(new Film("C", 2001));
		films.add(new Film("D", 2000));

		films.stream()
			.forEach(film -> System.out.println(film));

		System.out.println();

		Comparator<Film> comparator = Comparator
			.comparing(Film::getReleaseYear) // Class : Method
			.thenComparing(Film::getName);

		Collections.sort(films, comparator); // sort in order

		films.stream()
			.forEach(film -> System.out.println(film));
	}
}
