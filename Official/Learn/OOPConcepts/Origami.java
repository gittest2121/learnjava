/* Consider Origami is a company selling speakers */

class Origami {
	public static void main(String[] args) {
		Speaker model1 = new Speaker();
		Speaker model2 = new Speaker();
		Speaker model3 = new Speaker();

		model1.power(true);
		model1.mute(true);
		model1.volumeUp(3);

		model2.power(true);
		model2.volumeUp(7);
		model2.sound(true);
		model2.volumeDown(2);

		model3.power(false);
		model3.volumeUp(10);
		model3.volumeDown(4);

		model1.printOut();
		model2.printOut();
		model3.printOut();
	}
}
