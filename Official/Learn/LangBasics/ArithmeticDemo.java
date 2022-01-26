/* Changed the program to use compound assignments */
class ArithmeticDemo {
	public static void main(String[] args) {
		int result = 1 + 2;
		System.out.println(result);

		--result; // compound assignment instead of result = result - 1
		System.out.println(result);

		result *= 2; // compound assignment
		System.out.println(result);

		result /= 2; // compound assignment
		System.out.println(result);

		result += 8;
		result %= 7;
		System.out.println(result);
	}
}
