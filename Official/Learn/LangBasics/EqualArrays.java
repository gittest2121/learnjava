import java.util.Arrays;

class EqualArrays {
	public static void main(String[] args) {
		int[] a = {
			7, 5, 6,
			2, 4, 8
		};
		int[] b = Arrays.copyOfRange(a, 0, 5);
		int[] c = {
			7, 5, 6,
			2, 4, 8
		};
		System.out.println(Arrays.equals(a, b));
		System.out.println(Arrays.equals(a, c));
	}
}
