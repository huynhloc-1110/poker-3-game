package common;

import java.util.*;

public class Hand implements Comparable<Hand> {
	
	private ArrayList<Card> hold;
	
	public Hand() {
		hold = new ArrayList<>();
	}
	
	public void takeOne(CardSet cardSet) {
		if (hold.size() > 3) return;
		hold.add(cardSet.drawOne());
	}
	
	public void releaseAll() {
		hold = new ArrayList<>();
	}
	
	public int totalValue() {
		int sum = 0;
		int faceCardNum = 0;
		for (Card card : hold) {
			sum += card.getRank().getValue();
			if (card.getRank().isFaceCard()) faceCardNum++;
		}
		if (faceCardNum == 3) sum++;
		return sum;
	}

	@Override
	public int compareTo(Hand cmp) {
		return this.totalValue() - cmp.totalValue();
	}
}
