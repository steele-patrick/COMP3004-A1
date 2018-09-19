package core;

import java.util.*;

public class Deck extends Pile{
	Map<String, Integer> cardList = new HashMap<String, Integer>();	//List of legal cards for the Deck
	
	public Deck() {
		//Need to give relative path for \resources\Standard_52.csv
		String path = "\\path";
		this.initCardList(path);
		
		cardList.forEach((k,v)->{
			if(v == 11) { this.cards.add(new Ace(k)); }
			else { this.cards.add(new Card(k, v)); }
			this.size++;
		});
	}
	
	//Want: initialize the Deck's cardList with cards from a file
	private void initCardList(String path) {
			cardList.put("2S", 2);
			cardList.put("3S", 3);
			cardList.put("4S", 4);
			cardList.put("5S", 5);
			cardList.put("6S", 6);
			cardList.put("7S", 7);
			cardList.put("8S", 8);
			cardList.put("9S", 9);
			cardList.put("10S", 10);
			cardList.put("JS", 10);
			cardList.put("QS", 10);
			cardList.put("KS", 10);
			cardList.put("AS", 11);
		}

	
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
