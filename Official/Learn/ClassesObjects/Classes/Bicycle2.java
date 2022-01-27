public class Bicycle2 {

    // 3 fields
    private int cadence;
    private int gear;
    private int speed;

    // 1 constructor -- constructor should have same name as class
    public Bicycle2(int startCadence, int startSpeed, int startGear) {
        gear = startGear;
        cadence = startCadence;
        speed = startSpeed;
    }

    // 7 methods
    public int getCadence() {
        return cadence;
    }

    public void setCadence(int newValue) {
        cadence = newValue;
    }

    public int getGear() {
        return gear;
    }

    public void setGear(int newValue) {
        gear = newValue;
    }

    public int getSpeed() {
        return speed;
    }

    public void speedUp(int increment) {
        speed += increment;
    }

    public void applyBrake(int decrement) {
	speed -= decrement;
    }
}
