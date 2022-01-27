public class MountainBike2 extends Bicycle2 {

	// the MountainBike subclass has
	// one field
	private int seatHeight;

	// the MountainBike subclass has
	// one constructor
	public MountainBike2(int startHeight, int startCadence, int startSpeed, int startGear) {
		super(startCadence, startSpeed, startGear);
		seatHeight = startHeight;
	}

	// the MountainBike subclass has
	// two methods
	public void setHeight(int newValue) {
		seatHeight = newValue;
	}

	public int getHeight() {
		return seatHeight;
	}

        public static void main(String[] args) {
                Bicycle2 model1 = new Bicycle2(0, 0, 1);
                model1.speedUp(20);
                model1.setGear(2);
                model1.speedUp(40);
                model1.setGear(3);

                MountainBike2 model2 = new MountainBike2(3, 0, 20, 1);
                model2.setCadence(4);
                model2.applyBrake(10);
                model2.setHeight(2);

                System.out.println("Cadence of model1: " + model1.getCadence());
                System.out.println("Gear of model1: " + model1.getGear());
                System.out.println("Speed of model1: " + model1.getSpeed());

                System.out.println("Seat Height of model2: " + model2.getHeight());
                System.out.println("Cadence of model2: " + model2.getCadence());
                System.out.println("Gear of model2: " + model2.getGear());
                System.out.println("Speed of model2: " + model2.getSpeed());
	}
}

// MountainBike inherits all the fields and methods of Bicycle and adds the field seatHeight and a method to set it
