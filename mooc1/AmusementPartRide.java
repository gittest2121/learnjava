// object in an instance variable list
// A list is an object's instance variable that can contain objects other than strings as long as the type of objects in the list is specified when defiining the list

import java.util.ArrayList;

public class AmusementParkRide {
	private String name;
	private int minimumHeight;
	private int visitors;
	private ArrayList<Person> riding;

	public AmusementParkRide(String name, int minimumHeight) {
		this.name = name;
		this.minimumHeight = minimumHeight;
		this.visitors = 0;
		this.riding = new ArrayList<>();
	}

	public boolean isAllowedOn(Person person) {
		if (person.getHeight() < this.minimumHeight) {
			return false;
		}

		++this.visitors;
		this.riding.add(person);
		return true;
	}

	@Override
	public String toString() {

                String printOutput = this.name + ", minimum height requirement: " + this.minimumHeight + ", visitors: " + this.visitors + "\n" + "riding:\n";

		if (riding.isEmpty()) {
			return printOutput + "No one is on the ride.";

		String onTheRide = "";
		for (Person person : riding) {
			onTheRide = onTheRide + person.getName() + "\n";
		}


		return printOutput + "\n" + "On the ride:\n" + onTheRide;
	}
}
