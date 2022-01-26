class NandTest extends Nand_Gate {
	public static void main(String[] args) {
		Nand_Gate gate = new Nand_Gate();

		gate.head();
		gate.Nand(false, false);
		gate.Nand(true, false);
		gate.Nand(false, true);
		gate.Nand(true, true);
	}
}
