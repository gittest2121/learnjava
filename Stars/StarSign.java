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
			System.out.println("*");
		}
	}

	static void printSquare(int size) {
		for (int i = 0; i < size; ++i) {
			for (int j = 0; j < size; ++j) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	static void printRectangle(int width, int height) {
		for (int i = 0; i < height; ++i) {
			for (int j = 0; j < width; ++j) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	static void printTriangle(int size) {
		for (int i = 0; i < size; ++i) {
			for (int j = 0; j <= i; ++j) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
