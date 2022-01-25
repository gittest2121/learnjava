/* This is an example for illustrating arrays
 * We don't recommend writing program like this
 */

class Arrays {
	public static void main(String[] args) {
		// declare an array of integers
		int[] anArray;
		
		// allocates memory for 5 integers
		anArray = new int[5];

		// initialize each element
		anArray[0] = 100;
		anArray[1] = 200;
		anArray[2] = 300;
		anArray[3] = 400;
		anArray[4] = 500;

		for (int i = 0; i < 5; ++i) {
			System.out.println("Element at index " + i + ": " + anArray[i]);
		}
	}
}
