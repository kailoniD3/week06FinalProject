package javaFinalProjectW6;

public class Card {
		
		private int value;
		private String name;
		
	// set value and names of cards 
		public Card (int value, String name) {
			this.value = value;
			this.name = name;
			
		}
	// getters and setters 
		public int getValue() {
			return value;
		}

		public void setValue(int value) {
			this.value = value;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
	// describe method that prints info about a card 
		public void describe() {
			System.out.println("Card-  " + name);
			System.out.println("Value of card-  " + value);
		}
}
