import java.util.Arrays;

public class Replace {
        public static void main(String[] args) {
		String[] arr = {"Implement", "a", "java", "code"};
		for (int i = 0; i < arr.length; ++i) {
			if (arr[i].equals("java")) {
				arr[i] = "JAVA";
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
