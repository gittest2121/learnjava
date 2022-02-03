// From MOOC
class Stars {
	public static void main(String[] args) {
		printStars(1, 5);
	}

	static void printStars(int beginning, int end) {
		while (beginning < end) {
			System.out.print("*");
			++beginning;
		}
	}
}
