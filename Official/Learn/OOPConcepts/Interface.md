# Interface
Objects define their interaction with the outside world through the methods that they expose.<br>
Methods form the object's _interface_ with the outside world.<br>

Simply, An Interface is a group of related methods with empty bodies. Something like a template for a class.<br>

## Example
interface Bicycle {
        // wheel revolutions per minute
        void changeCadence(int newValue);
        void changeGear(int newValue);
        void speedUp(int increment);
        void applyBrakes(int decrement);
}

### To implement this interface, the name of your class would change (to a particular brand of bicycle, for example, such as ACMEBicycle), and you'd use the _implements_ keyword in the class declaration
class ACMEBicycle implements Bicycle {
        int cadence = 0;
	int speed = 0;
	int gear = 1;

	// The compiler will now require that methods
	// changeCadence, changeGear, speedUp, and applyBrakes
	// all be implemented. Compilation will fail if those
	// methods are missing from this class.

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

Implementing an interface allows a class to become more formal about the behavior it promises to provide. Interfaces form a contract between the class and the outside world, and this contract is enforced at build time by the compiler.

If your class claims to implement an interface, all methods defined by that interface must appear in its source code before the class will successfully compile.

_Note:_ to actually compile the ACMEBicycle class, you'll need to add the public keyword to the beginning of the implemented interface methods.
