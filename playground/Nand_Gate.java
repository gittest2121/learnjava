/**
 * Nand - Not And
 * Output = 0 only if both inputs are 1
 */

class Nand_Gate {
	
	void head() {
		String heading = "|\ta\t|\tb\t|\tOutput\t|";
		System.out.println(heading);
		String heading_notabs = heading.replace("\t", "        ");
		System.out.println("-".repeat(heading_notabs.length()));
	}

	void Nand(boolean a, boolean b) {
		System.out.println("|\t" + a + "\t|\t" + b + "\t|\t" + (!a || !b) + "\t|");
	}
}
