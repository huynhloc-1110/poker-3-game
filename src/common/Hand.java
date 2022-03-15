package common;

import java.util.*;

public class Hand implements Comparable<Hand> {
	
	private ArrayList<Card> hold;
	private String playerName;
	
	public Hand(String name) {
		hold = new ArrayList<>();
		playerName = name;
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
		sum %= 10;
		if (faceCardNum == 3) sum++;
		return sum;
	}

	@Override
	public int compareTo(Hand cmp) {
		return this.totalValue() - cmp.totalValue();
	}
	
	@Override
	public String toString() {
		return "\nPlayer %s:\n " + hold + "\nTotal card value: " + totalValue() + "\n"; 
	}
}
