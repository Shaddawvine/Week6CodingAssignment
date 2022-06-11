package week6;
import java.util.*;
public class App {

	
	public static void main(String[] args) {
		
		Deck warDeck = new Deck();
		warDeck.shuffle();
		
	
		Player player1, player2;
		player1 = new Player();
		player2 = new Player();
	
	
		for (int a = 0; a < 52; a++) {
			if (a % 2 == 0) {player1.drawPlayer(warDeck);}
			else {player2.drawPlayer(warDeck);}
		}
	
		for (int b = 0; b < 26; b++) {
			if (player1.flip().getValue() > player2.flip().getValue()) {player1.incrementScore();}
			else {player2.incrementScore();}
		}
	
	
		System.out.println("Player 1: " + player1.getScore() + " " + "Player 2: " + player2.getScore());
		if (player1.getScore() > player2.getScore()) {System.out.println("Player 1 wins.");}
		else if (player2.getScore() > player1.getScore()) {System.out.println("Player 2 wins.");}
		else {System.out.println("Draw");}
	}

	
	
	
}
