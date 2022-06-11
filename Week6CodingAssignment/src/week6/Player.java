package week6;
import java.util.*;
public class Player {

	private List<Card> hand = new ArrayList<Card>();
	private int score = 0;
	private String playerName;
	
	
	
	
		
	public void describePlayer(){
		System.out.println(playerName);
	}

	public Card flip(){
	return hand.remove(0);
	}
	
	
	public void drawPlayer(Deck cards) {
		hand.add(cards.drawDeck());
	}
		
	public void incrementScore() {
		setScore(getScore() + 1);
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
	
	
	
	
	
}