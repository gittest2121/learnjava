import java.util.Random;
import java.util.Arrays;

class BinarySearch_Array {
	public static void main(String[] args) {
		
		// Random Number generator
		Random rand = new Random();

		double a[] = {
			rand.nextDouble(), rand.nextDouble(),456.25,
			rand.nextDouble(), rand.nextDouble(), rand.nextDouble()
		};

		Arrays.parallelSort(a);

		int c = Arrays.binarySearch(a, 456.25);

		System.out.println(c);
	}
}
