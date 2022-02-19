/* List as a Method Parameter
 * Like other variables, a list can be used as a parameter to a method too
 * When the method is defined to take a list as a parameter,
 *     the type of the parameter is defined as the type of the list and the type of the values contained in that list
 *
 */

import java.util.ArrayList;

class ListParameter {
	static void printthis(ArrayList<String> list) {
		for (String value : list) {
			System.out.println(value);
		}
	}

	public static void main(String[] args) {
		ArrayList<String> strings = new ArrayList<>();

		strings.add("first");
		strings.add("second");
		strings.add("third");

		printthis(strings);

		System.out.println("\n\n\n\n\n");

		ArrayList<Integer> list = new ArrayList<>();

		list.add(1);
		list.add(2);
		list.add(3);
		list.add(2);
		list.add(1);

		printSmallerThan(list, 3);
	}

/*
 * The chosen parameter in the method definition is not dependent on
 * the list that is passed as parameter to method call
 *
 * It is also possible to define mutliple variables for a method.
 * 
 */
	static void printSmallerThan(ArrayList<Integer> numbers, int threshold) {
		for (int number : numbers) {
			if (number < threshold) {
				System.out.println(number);
			}
		}
	}
}
