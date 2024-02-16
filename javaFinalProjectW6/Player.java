package javaFinalProjectW6;

import java.util.ArrayList;
import java.util.List;

public class Player {
	private List<Card> hand;
	private int score;
	private String name;

// hand, score and name 
	public Player(String name) {
		this.name = name;
		this.hand = new ArrayList<>();
		this.score = 0;
	}
// prints info about player and each card 
	public void describe() {
		System.out.println("Player - " + name);
		System.out.println("Hand - " );
		for (Card card : hand) {
			card.describe();
		}
	}
//flip method returns the top card to the player 
	public Card flip() {
		if (!hand.isEmpty()) {
			return hand.remove(0);
		}else {
			System.out.println("Hand is empty.");
			return null;
		}
	}
// calls on draw method adding the returned card to the hand 
	public void draw(Deck deck) {
		Card newCard = deck.draw();
		if (newCard !=null ) {
			hand.add(newCard);
		}
	}
//Increments the score 
	public void incrementScore() {
		score++;
	}
	public int getScore() {
		return score;
	}
}

