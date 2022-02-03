class AdvancedAstrology {

    static void printStars(int number) {
        for (int i = 0; i < number; ++i) {
            System.out.print("*");
        }
        System.out.println();
    }

    static void printSpaces(int number) {
        for (int i = 0; i < number; ++i) {
            System.out.print(" ");
        }
    }

    static void printTriangle(int size) {
        for (int i = size; i >= 0; --i) {
            printStars(size-i);
            printSpaces(i);
        }
    }

    static void christmasTree(int height) {
	    for (int i = 0; i < height; ++i) {
		    for (int j = 0; j < (height-1-i); ++j) {
			    System.out.print(" ");
		    }
		    for (int j = (height-i); j <= (height+i); ++j) {
			    System.out.print("*");
		    }
		    System.out.println();
	    }
	    for (int i = height; i < (height+2); ++i) {
		    for (int j = 0; j < (height-2); ++j) {
			    System.out.print(" ");
		    }
		    for (int j = (height-2); j <= height; ++j) {
			    System.out.print("*");
		    }
		    System.out.println();
	    }
    }

    public static void main(String[] args) {
        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}

