public class Rectangle {

	// instance variables -- describes the object's data
	// non-static fields
	private int width;
	private int height;

	// constructor -- used to create objects
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}

	// methods -- define object's behavior
	
	public void widen() {
		++this.width;
	}

	public void narrow() {
		if (this.width > 0) {
			--width;
		}
	}

	public int surfaceArea() {
		return this.width * this.height;
	}
	
	public String toString() {
		return "(" + this.width + ", " + this.height + ")";
	}
}
