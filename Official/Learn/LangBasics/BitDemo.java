class BitDemo {
	public static void main(String[] args) {
		int bitmask = 0x000F;
		int val = 0x2222;
		// prints "2"
		System.out.println(val & bitmask);

		// Let's play sometime with this program -- Don't do like this -- Useless code ever made
		System.out.println(" \t0000000000" + Integer.toBinaryString(bitmask));
		System.out.println("&\t" + Integer.toBinaryString(val));
		System.out.println("---------------------------------");
		System.out.println(" \t000000000000" + Integer.toBinaryString(val & bitmask));
	}
}
