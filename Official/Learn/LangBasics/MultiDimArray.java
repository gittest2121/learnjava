class MultiDimArray {
	public static void main(String[] args) {
		String[][] names = {
			{"Meow", "Moo", "Bow"},
			{"Cat", "Dog"}
		};
		// Cat Meow
		System.out.println(names[1][0] + names[0][0]);

		// Dog Bow
		System.out.println(names[1][1] + names[0][2]);

		System.out.println(names.length);
		System.out.println(names[0].length);
		System.out.println(names[1].length);

		int len = 1;
		for (int i = 0; i < names.length; ++i) {
			len *= names[i].length;
		}
		System.out.println(len);
	}
}

// The variables declared inside the for loop are visible inside only inside of the loop.
// Credits: https://stackoverflow.com/a/10454385
// License: CC-BY-SA 3.0
