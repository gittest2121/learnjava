import java.util.Arrays;
import java.util.Random;

class SortArray {
	public static void main(String[] args) {
		int[] a = {
			4748, 499, 17,
			128, 28, 821,
			185, 1, 471
		};

		Arrays.sort(a);
		System.out.println(Arrays.toString(a));


		// Random number generator
		Random rand = new Random();

		// parallelSort uses multithreading for faster performance
		int[] b = {
			rand.nextInt(35), rand.nextInt(34), rand.nextInt(2),
			rand.nextInt(1), rand.nextInt(), rand.nextInt()
		};

		Arrays.parallelSort(b);
		System.out.println(Arrays.toString(b));

		int[][] c = {
			{85, 49841, 1891},
			{1619, 84, 818}, {848}
		};

		for (int[] row : c)
			Arrays.parallelSort(row);
		System.out.println(Arrays.deepToString(c));
	}
}

// Parallel sorting of large arrays on multiprocessor systems is faster
// than sequential array sorting
