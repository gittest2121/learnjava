public class Test {
	public static void main(String[] args) {
		String text = "AGCTTTTCATTCTGACTGCAACGGGCAATATGTCTCTGTGTGGATTAAAAAAAGAGTGTCTGATAGCAGC";

		int count = 0;
		for (int i = 0; i < text.length(); ++i) {
			if (text.substring(i, i+1).equals("A")) {
				++count;
			}
		}

		System.out.println("A: " + count);
	}
}
