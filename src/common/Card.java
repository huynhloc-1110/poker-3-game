package common;

public class Card {
	
	private Rank rank;
	private Suit suit;
	
	public Card(Rank rank, Suit suit) {
		this.rank = rank;
		this.suit = suit;
	}
	
	public int getValue() {
		return rank.getValue();
	}
	
	@Override
	public String toString() {
		return "Rank: " + rank + ", Suit: " + suit;
	}
}
