import java.util.HashMap;

public class HS {

	public static void main(String[] args) {

		HashMap<String, String> postalCodes = new HashMap<>();
		postalCodes.put("00710", "Helsinki");
		postalCodes.put("90014", "Oulu");
		postalCodes.put("33720", "Tampere");
		postalCodes.put("33014", "Tampere");

		System.out.println(postalCodes.get("00710"));

		HashMap<Integer, String> jokenumbers = new HashMap<>();
		jokenumbers.put(2, "meow");
		jokenumbers.put(7, "hoho");
		jokenumbers.put(2, "lol");
		jokenumbers.put(9, "hoho");

		System.out.println(jokenumbers.get(2));
		System.out.println(jokenumbers.get(7));
		System.out.println(jokenumbers.get(9));
	}
}
