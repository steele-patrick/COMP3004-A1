package core;

import java.util.*;
import java.io.*;

public abstract class Pile {
	
	protected LinkedList<Card> cards = new LinkedList<Card>(); 	// Storage for cards
	protected int numCards = 0;										// Number of cards
	
	public static class legalCard{
		private Map<String, Integer> cardList = new HashMap<String, Integer>();
		
		private void init() {
		
		}
		
		public int getValue(String card) {
			return 0;
		} 
	}	
	
	public int getSize() {
		return this.numCards;
	}
	
}
