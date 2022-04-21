import java.util.Arrays;

public class Reverse {
	public static void main(String[] args) {
		String[] arr = {"Implement", "a", "java", "code"};
		System.out.println(Arrays.toString(reverse(arr)));
	}

	private static Object[] reverse(Object[] arr) {
		Object[] reversed = new Object[arr.length];
		for (int i = 0; i < arr.length; ++i) {
			reversed[i] = arr[arr.length - i - 1];
		}

		return reversed;
	}
}
