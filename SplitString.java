class SplitString {
	public static void main(String[] args) {
		String text = "first second third fourth";
		String[] pieces = text.split(" ");
		
		for (int i = 0; i < pieces.length; ++i) {
			System.out.println(pieces[i]);
		}

		String trial = String.valueOf(7412);
		String[] digits = trial.split("");

		for (int i = 0; i < digits.length; ++i) {
			System.out.println(digits[i]);
		}
	}
}
