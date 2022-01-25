import java.util.Arrays;

/**
 * Java SE provides methods to perform some of the most common manipulations related to arrays
 * Class: java.util.Arrays
 * Method: copyofRange(copyFrom, from_index, to_index)
 */
class ArrayManipulation {
	public static void main(String[] args) {
		String[] copyFrom = {
			"Apple", "Banana", "Orange", "Pineapple", "Mango", "Grapes", "Cherry", "Watermelon", "Strawberry"
		};

		String[] copyTo = Arrays.copyOfRange(copyFrom, 2, 7);
		for (String coffee : copyTo) {
			System.out.print(coffee + " ");
		}
	}
}

// It seems that this method is to_index exclusive
