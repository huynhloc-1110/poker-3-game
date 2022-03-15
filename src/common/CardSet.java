package common;

import java.util.*;

public class CardSet {
	
	private ArrayList<Card> cardSet;
	
	public CardSet() {
		cardSet = new ArrayList<>();
		for (Rank rank : Rank.values()) {
			for (Suit suit : Suit.values()) {
				Card card = new Card(rank, suit);
				cardSet.add(card);
			}
		}
	}
	
	public void shuffle() {
		ArrayList<Card> temp = new ArrayList<Card>();
        Random random = new Random();
        while (cardSet.size() > 0) {
            int randomIndex = random.nextInt(cardSet.size());
            temp.add(cardSet.get(randomIndex));
            cardSet.remove(randomIndex);
        }
        cardSet = temp;
	}
	
	public Card drawOne() {
		return cardSet.get(0);
	}
	
	@Override
	public String toString() {
		StringBuilder result = new StringBuilder();
		for (Card card : cardSet) {
			result.append(card.toString());
			result.append("\n");
		}
		return result.toString();
	}
}
