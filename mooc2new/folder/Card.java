public class Card {
	private int value;
	private Suit suit;

	public Card(int value, Suit suit) {
		this.value = value;
		this.suit = suit;
	}

	public Suit getSuit() {
		return this.suit;
	}

	public int getValue() {
		return this.value;
	}

	@Override
	public String toString() {
		return suit + " " + value;
	}

	public static void main(String[] args) {
		Card first = new Card(10, Suit.HEART);
		System.out.println(first);

		if (first.getSuit() == Suit.SPADE) {
			System.out.println("is a spade");
		} else {
			System.out.println("Wrong");
		}
	}
}
