import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class PairSum {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5, 6};
		List<int[]> pairs = new ArrayList<>();
		for (int num1 : arr) {
			for (int num2 : arr) {
				if (num1 + num2 == 9) {
					pairs.add(new int[]{num1, num2});
				}
			}
		}

		for (int[] pair : pairs) {
			System.out.println(Arrays.toString(pair));
		}
	}
}
