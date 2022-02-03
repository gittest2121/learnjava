class StarSign {
	public static void main(String[] args) {
		printStars(3);
		System.out.println("\n---");
		printSquare(4);
		System.out.println("\n---");
		printRectangle(5, 6);
		System.out.println("\n---");
		printTriangle(3);
		System.out.println("\n---");
	}

	static void printStars(int number) {
		for (int i = 0; i < number; ++i) {
			System.out.print("*");
		}
	}

	static void printSquare(int size) {
		for (int i = 0; i < size; ++i) {
			printStars(size);
			System.out.println();
		}
	}

	static void printRectangle(int width, int height) {
		for (int i = 0; i < height; ++i) {
			printStars(width);
			System.out.println();
		}
	}

	static void printTriangle(int size) {
		for (int i = 0; i <= size; ++i) {
			printStars(i);
			System.out.println();
		}
	}
}
