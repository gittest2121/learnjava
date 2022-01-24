/**
 * Classes
 * A class is a blueprint from which induvidual objects are created
 */

class Bicycle {
	int cadence = 0;
	int speed = 0;
	int gear = 1;

	void changeCadence(int newValue) {
		cadence = newValue;
	}
	void changeGear(int newValue) {
		gear = newValue;
	}
	void speedUp(int increment) {
		speed += increment;
	}
	void applyBrakes(int decrement) {
		speed -= decrement;
	}
	void printStates() {
		System.out.println("cadence: " + cadence + " speed: " + speed + " gear: " + gear);
	}
}

/**
 * The fields cadence, speed and gear -- represents object state
 * And the methods changeCadence, changeGear, speedUp, applyBrakes -- defines its interaction with outside world
 *
 * Unrelated: cadence is also known as pedalling rate -- number of revolutions of crank per minute
 */
