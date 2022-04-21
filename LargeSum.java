import java.util.Arrays;

public class LargeSum {
	public static void main(String[] args) {
		int[] nums = {1, 3, 5, 7, 8, 10, 51, 5, 10, 26, 48, 1, 17, 2, 4};
		int maxSum = 0;
		int[] subArray = new int[3];
		for (int i = 0; i < nums.length - 2; ++i) {
			int[] sub = {nums[i], nums[i + 1], nums[i + 2]};
			int sum = nums[i] + nums[i + 1] + nums[i + 2];
			if (maxSum < sum) {
				maxSum = sum;
				subArray = sub;
			}
		}

		System.out.println(Arrays.toString(subArray));
	}
}
