package common;

import java.util.*;

public class Game {
	
	public static void main(String[] args) {
		//set up a deck
		CardSet deck = new CardSet();
		deck.shuffle();
		
		//make a list of players
		ArrayList<Hand> players = new ArrayList<>();
		
		//create 3 players
		Hand p1 = new Hand("Kronii");
		Hand p2 = new Hand("Ina");
		Hand p3 = new Hand("Subaru");
		
		//add players to list
		players.add(p1); players.add(p2); players.add(p3);
		
		//each player take 3 cards
		for (int i = 0; i < 3; i++) {
			for (Hand p : players) {
				p.takeOne(deck);
			}
		}
		
		//display card's value of each player
		for (Hand p : players) {
			System.out.println(p);
		}
		
		//calculate the winner
		int max = -1;
		for (Hand p : players) {
			int pValue = p.totalValue();
			max = (max < pValue)? pValue : max;
		}
		ArrayList<Hand> winners = new ArrayList<>();
		for (Hand p : players) {
			if (p.totalValue() == max)
				winners.add(p);
		}
		
		//display the winner
		System.out.print("The winner: ");
		for (Hand winner : winners) {
			System.out.print(winner.getName() + " ");
		}
	}
}
