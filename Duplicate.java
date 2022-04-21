import java.util.ArrayList;
import java.util.Arrays;

public class Duplicate {
	public static void main(String[] args) {
		int[] arr = {1, 7, 5, 6, 7, 3, 6, 4, 5};
		ArrayList<Integer> result = new ArrayList<>();
		for (int num : arr) {
			if (!result.contains(num)) {
				result.add(num);
			}
		}

		System.out.println(Arrays.toString(result.toArray()));
	}
}
