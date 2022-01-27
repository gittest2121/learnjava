import java.util.Random;

class BreakDemo {
	public static void main(String[] args) {

		Random rand = new Random();
		int[] arrayofInts =
		{ rand.nextInt(40), rand.nextInt(90), rand.nextInt(5), rand.nextInt(600),
			12, rand.nextInt(1100), rand.nextInt(2001),
			rand.nextInt(10), rand.nextInt(625), rand.nextInt(128) };
		int searchfor = 12;

		int i;
		boolean found = false;

		for (i = 0; i < arrayofInts.length; ++i) {
			if (arrayofInts[i] == searchfor) {
				found = true;
				break;
			}
		}

		if (found) {
			System.out.println("Found " + searchfor + " at index " + i);
		} else {
			System.out.println(searchfor + " not in the array");
		}
	}
}
