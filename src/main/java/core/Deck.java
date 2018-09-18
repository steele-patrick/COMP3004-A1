package core;

import java.util.Collections;

public class Deck extends Pile{
	
	//Randomly permutes linked list cards
	public int shuffle() {
		try {
		Collections.shuffle(cards);
		}
		catch(Exception e) {
			return -1;
		}
		return 0;		
	}
	
	//Gives the top Card of cards
	public Card top() {
		if(this.size == 0) { return null; }
		return cards.getFirst();
	}
}
