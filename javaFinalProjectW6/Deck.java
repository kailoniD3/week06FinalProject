package javaFinalProjectW6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class Deck {

		private List<Card> cards;
		
		public Deck() {
			this.cards = new ArrayList<>();
			initializeDeck();
		}
	// list of cards suits and values 
		private void initializeDeck() {
			// TODO Auto-generated method stub
			String[] suits = {"Diamonds", "Clubs", "Hearts", "Spades"};
				for (String suit : suits) {
					for (int value = 2; value <= 14; value++) {
						String name = getValueName(value) + "of" + suit;
						cards.add(new Card(value, name));
					}		
				}	
		}

		private String getValueName(int value) {
			// TODO Auto-generated method stub
			switch(value) {
			case 10: 
				return "Jack";
			case 11: 
				return "Queen";
			case 12:
				return "King";
			case 13:
				return "Ace";
			default: 
				return String.valueOf(value);
			}
			
		}
	//shuffle cards 
		public void shuffle() {
			Collections.shuffle(this.cards);
		}
	// draws cards 
		public Card draw() {
			Card card = this.cards.remove(0);
			return card;
}
}