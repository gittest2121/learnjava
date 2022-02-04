/* The list method *contains* can be used to
 * check the existence of a value in the list
 *
 * The method receives the value to be searched as its parameter, and it
 * returns a boolean type value (true or false) that indicates whether or
 * not that value is stored in the list
 */

import java.util.ArrayList;

class ContainsList {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();

		list.add("first");
		list.add("second");
		list.add("third");

		System.out.println("Is the first found? " + list.contains("first"));
		System.out.println("Is the Second found? (check case) " + list.contains("Second"));
	}
}
