import java.util.Arrays;

public class Array1 {
	public static void main(String[] args) {
		
		int[] arr = {10, 20, 30, 40, 50};

		Arrays.stream(arr).forEach(System.out::println);
	}
}
