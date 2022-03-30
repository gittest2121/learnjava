import java.util.List;
import java.util.ArrayList;

public class Hand {
	private List<Card> cards;

	public Hand() {
		this.cards = new ArrayList<>();
	}

	public void add(Card card) {
		this.cards.add(card);
	}

	public void print() {
		Iterator<Card> iterator = cards.iterator();

		while (iterator.hasNext()) {
			Card nextInLine = iterator.next();
			System.out.println(nextInLine);
		}
	}
}
