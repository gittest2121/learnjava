import java.util.Arrays;

class FillArrays {
	// Filling an array to place a specific value at each index
	public static void main(String[] args) {
		double[] a = {
			1.2, 48.5, 846.4,
			98461.46, -4653.4, 13
		};

		double b = 1532.531;

		Arrays.fill(a, b);

		double[][] c = {
			{476.961, 71652, 56.78},
			{74481, 781530.4, 714.15}
		};

		double d = 4444.44;

		for (double[] row: c)
			Arrays.fill(row, 1, 2, d);
		// Arrays.fill(matrix, fromIndex, toIndex, value);


		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.deepToString(c));
	}
}
