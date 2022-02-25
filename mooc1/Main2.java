import java.util.ArrayList;

public class Main2 {

	public static void main(String[] args) {

		ArrayList<Bird> birds = new ArrayList<>();
		Bird red = new Bird("Red");

		// red object has been created
		// but not added
		if (birds.contains(red)) {
			System.out.println("Red is on the list.");
		} else {
			System.out.println("Not");
		}

		birds.add(red);

		if (birds.contains(red)) {
                        System.out.println("Red is on the list.");
                } else {
                        System.out.println("Not");
                }

		// change to new object of same parameters
		// actually, the next one should be Not.
		// But since we overrided the default equals method
		// It changes to true(Red...e list)
		red = new Bird("Red");

		if (birds.contains(red)) {
                        System.out.println("Red is on the list.");
                } else {
                        System.out.println("Not");
                }

	}
}
