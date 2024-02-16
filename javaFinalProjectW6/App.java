package javaFinalProjectW6;

public class App {

		public static void main (String [] args) {
	
			// Instantiate deck and 2 players 	
			Deck deck = new Deck();
			Player player1 = new Player ("Player 1");
			Player player2 = new Player ("Player 2");
			
			deck.shuffle();
			
			//draws cards for players 
			for (int i =0; i <52; i++) {
				if (i % 2 ==0 ) {
					player1.draw(deck);
				} else {
					player2.draw(deck);
				}
			}
			
		//flips cards to compare values 
			for (int i = 0; i < 26; i++) {
				Card card1 = player1.flip();
				Card card2 = player2.flip();
				
				System.out.println("Player 1: " + card1.getName());
				System.out.println("Player 2: " + card2.getName());
				
		//compare the value of flipped cards and rewards points
				
				if (card1.getValue() > card2.getValue()) {
					player1.incrementScore();
					System.out.println("YAY!     PLAYER 1   +1 point.");
				} else if (card1.getValue() < card2.getValue()) {
					player2.incrementScore();
					System.out.println("YAY!     PLAYER 2   +1 point.");
				} else {
					System.out.println("TIE :( NO POINTS ");
				}
			}
			
			
		//get final scores 
			int score1 = player1.getScore();
			int score2 = player2.getScore();
			
			System.out.println("Final scores.... PLAYER 1: " + score1 +" PLAYER 2: " + score2);
			if (score1 > score2) {
				System.out.println("CONGRATULATIONS PLAYER 1 WINS!");
			} else if (score2 > score1) {
				System.out.println("CONGRATULATIONS PLAYER 2 WINS!");
			} else {
				System.out.println("  DRAW :(   ");
			}
		}
		
}
