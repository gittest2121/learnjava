class ContinueDemo {
	public static void main(String[] args) {

		String searchMe = "peter piper picked a " + "peck of pickled peppers";
		int max = searchMe.length();
		int num_P = 0;

		for (int i = 0; i < max; ++i) {
			// interested only in P's
			if (searchMe.charAt(i) != 'p')
				continue;

			// process P's
			++num_P;
		}
		// I don't know whether this is good but I think the beter way is to search for P's
		System.out.println("Found " + num_P + " p's in the string.");
	}
}
