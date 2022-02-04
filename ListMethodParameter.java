/*
 * On Copying the List to a Method Parameter
 *
 * Lists - store large amounts of information - reference-type variables
 *
 * When a list (or any reference-type variable) is copied for a method's use, the method receives the value of the list variable, i.e., a reference.
 *
 * In such a case, the *method receives a reference to the real value of
 * a reference-type variable, and the method is able to modify the value of
 * the original reference type variable, such as a list*
 *
 * In practice, the *list that the method receives as a parameter is the same list that is used in the program that calls the method*
 *
 */

import java.util.ArrayList;
class ListMethodParameter {
	public static void removeFirst(ArrayList<Integer> numbers) {
		if (numbers.size() == 0) {
			return;
		}

		numbers.remove(0);
	}

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(3);
		numbers.add(2);
		numbers.add(6);
		numbers.add(-1);

		System.out.println(numbers);

		removeFirst(numbers);

		System.out.println(numbers);

		removeFirst(numbers);
		removeFirst(numbers);
		removeFirst(numbers);

		System.out.println(numbers);
	}
}
