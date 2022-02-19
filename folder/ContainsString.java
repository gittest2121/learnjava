class ContainsString {
	public static void main(String[] args) {
		String text = "volcanologist";

		if (text.contains("can")) {
			System.out.println("can was found");
		}

		if (!text.contains("tin")) {
			System.out.println("tin wasn't found");
		}
	}
}
