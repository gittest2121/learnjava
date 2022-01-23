// Playing with bitwise operators
class Bitwise {
	public static void main(String[] args) {
		int n = 0b1010;
		int fourthBitfromRight = (n & 0b1000) / 0b1000;
		System.out.println(fourthBitfromRight);
	}
}
