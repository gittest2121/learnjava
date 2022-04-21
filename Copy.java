import java.util.Arrays;

public class Copy {
	public static void main(String[] args) {
		int[] arr1 = {2, 4, 6};
		int[] arr2 = {1, 3};
		int[] concated = new int[arr1.length + arr2.length];
		System.arraycopy(arr1, 0, concated, 0, arr1.length);
		System.arraycopy(arr2, 0, concated, arr1.length, arr2.length);
		System.out.println(Arrays.toString(concated));
	}
}
