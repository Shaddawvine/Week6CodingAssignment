package week6;
import java.util.*;


public class Deck {

	List<Card> cards = new ArrayList<Card>();
	
	public Deck() {
		String[] suits = new String[4];
		suits[0] = "Hearts";
		suits[1] = "Clubs";
		suits[2] = "Diamonds";
		suits[3] = "Spades";
		
		String[] cardNames = new String [13];
		cardNames[0] = "Two";
		cardNames[1] = "Three";
		cardNames[2] = "Four";
		cardNames[3] = "Five";
		cardNames[4] = "Six";
		cardNames[5] = "Seven";
		cardNames[6] = "Eight";
		cardNames[7] = "Nine";
		cardNames[8] = "Ten";
		cardNames[9] = "Jack";
		cardNames[10] = "Queen";
		cardNames[11] = "King";
		cardNames[12] = "Ace";
		
		for (String suit : suits) {
			for (int i = 2; i < 15; i++) {
				Card c = new Card();
				c.setName(cardNames[i - 2] + "of" + suit);
				c.setValue(i);
				cards.add(c);
				
			}
		}
	}
	
	
	public void shuffle() {
		Collections.shuffle(cards);
		
		
	}
	
	
	
	public Card drawDeck() {
		return cards.remove(0);
	}

}
