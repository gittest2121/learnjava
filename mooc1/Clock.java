public class Clock {

	private ClockHand hours;
	private ClockHand minutes;
	private ClockHand seconds;

	public Clock() {
		this.hours = new ClockHand(24);
		this.minutes = new ClockHand(60);
		this.seconds = new ClockHand(60);
	}

	public void advance() {
		this.seconds.advance();

		if (this.seconds.value() == 0) {
			this.minutes.advance();

			if (this.minutes.value() == 0) {
				this.hours.advance();
			}
		}
	}

	@Override
	public String toString() {
		return hours + ":" + minutes + ":" + seconds;
	}

	public static void main(String[] args) {

		Clock clock = new Clock();

		try {
			while (true) {
				System.out.println(clock);
				clock.advance();
				Thread.sleep(500);
			}

		} catch (InterruptedException e) {
			System.out.println("Error: Keyboard Interrupt");
		}
	}
}
